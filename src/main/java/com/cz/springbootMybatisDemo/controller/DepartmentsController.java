package com.cz.springbootMybatisDemo.controller;

import com.cz.springbootMybatisDemo.entity.Departments;
import com.cz.springbootMybatisDemo.entity.Students;
import com.cz.springbootMybatisDemo.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created 2019-08-07.
 *
 * @author changzheng
 */
@RestController

public class DepartmentsController {

    @Autowired
    private DepartmentsService departmentsService;

    @GetMapping("queryStuByDept")
    public List<Students> queryStuByDept(@RequestParam("deptName")String deptName){
        return  departmentsService.queryStuByDept(deptName);
    }

    @GetMapping("queryStuByDept1")
    public List<Map<String,Object>> queryStuByDept1(@RequestParam("deptName")String deptName){
        return  departmentsService.queryStuByDept1(deptName);
    }


    @GetMapping("getById")
    public Departments getById(@RequestParam("deptId")Integer deptId){
        return departmentsService.findById(deptId);
    }


    @RequestMapping("/ioexception")
    public void throwException() throws IOException {
        throw new IOException("111");
    }

    @GetMapping("runtimeException")
    public void throwRun(){
        throw new RuntimeException("222");
    }
}
