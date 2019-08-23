package com.cz.springbootMybatisDemo.controller;

import com.cz.springbootMybatisDemo.entity.Students;
import com.cz.springbootMybatisDemo.mapper.StudentsMapper;
import com.cz.springbootMybatisDemo.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * Created 2019-08-06.
 *
 * @author changzheng
 */
@RestController
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @Autowired
    private StudentsMapper studentsMapper;

    @GetMapping("/get")
    public Students getStudents(@RequestParam("id") int id) {
        Students students = studentsService.findById(id);
        return students;
    }

    @PostMapping("/insert")
    public String insertStudents(@RequestParam(value = "id", required = false) Integer id, @RequestParam(value = "name", required = true) String name, @RequestParam(value = "deptId", required = false) Integer deptId,
                                 @RequestParam(value = "age", required = false) Integer age, @RequestParam(value = "sex", required = false) String sex, @RequestParam(value = "height", required = false) Integer height, @RequestParam(value = "loginDate", required = true) Date loginDate) {

        Students students = new Students();
        if (id != null) {
            students.setId(id);
        }
        if (name != null) {
            students.setName(name);
        }
        if (deptId != null) {
            students.setDeptId(deptId);
        }
        if (age != null) {
            students.setAge(age);
        }
        if (sex != null) {
            students.setSex(sex);
        }
        if (loginDate != null) {
            students.setLoginDate(loginDate);
        }
        if (height != null) {
            students.setHeight(height);
        }
        studentsService.insert(students);
        return "插入成功！";
    }

    @PostMapping("/update")
    public String updateStudents(@RequestParam(value = "id", required = true) Integer id, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "deptId", required = false) Integer deptId,
                                 @RequestParam(value = "age", required = false) Integer age, @RequestParam(value = "sex", required = false) String sex, @RequestParam(value = "height", required = false) Integer height, @RequestParam(value = "loginDate", required = false) Date loginDate) {
        Students students = studentsService.findById(id);
        if (name != null) {
            students.setName(name);
        }
        if (deptId != null) {
            students.setDeptId(deptId);
        }
        if (age != null) {
            students.setAge(age);
        }
        if (sex != null) {
            students.setSex(sex);
        }
        if (loginDate != null) {
            students.setLoginDate(loginDate);
        }
        if (height != null) {
            students.setHeight(height);
        }
        studentsService.update(students);
        return "更新成功！";

    }

    @DeleteMapping("/delete")
    public Students deleteStudents(@RequestParam("id") int id) {
        Students students = studentsService.findById(id);
        studentsService.delete(students);
        return students;
    }

    @PostMapping("queryDeptId")
    public List<Integer> queryDeptId(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return studentsService.queryDeptIdByNameAndAge(name, age);
    }

    @GetMapping("queryDeptName")
    public String queryDeptNameByStId(@RequestParam("id") Integer id) {
        return studentsService.queryDeptNameByStId(id);
    }

    @GetMapping("/byName")
    public Students findByName(@RequestParam("name") String name) {
        return studentsMapper.findByName(name);
    }

}
