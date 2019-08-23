package com.cz.springbootMybatisDemo.service.impl;

import com.cz.springbootMybatisDemo.entity.Departments;
import com.cz.springbootMybatisDemo.entity.Students;
import com.cz.springbootMybatisDemo.mapper.DepartmentsMapper;
import com.cz.springbootMybatisDemo.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created 2019-08-07.
 *
 * @author changzheng
 */
@Service
public class DepartmentsServiceimpl implements DepartmentsService {

    @Autowired
    private DepartmentsMapper departmentsMapper;
    @Override
    public List<Students> queryStuByDept(String deptName) {
        return departmentsMapper.queryStuByDept(deptName);
    }

    @Override
    public List<Map<String,Object>> queryStuByDept1(String deptName) {

        return departmentsMapper.queryStuByDept1(deptName);
    }

    @Override
    public Departments findById(Integer deptId) {
        return departmentsMapper.findById(deptId);
    }

    @Override
    public Departments findByName(String name) {
        return departmentsMapper.findByName(name);
    }

    @Override
    public Departments findByType(String type) {
        return departmentsMapper.findByType(type);
    }
}
