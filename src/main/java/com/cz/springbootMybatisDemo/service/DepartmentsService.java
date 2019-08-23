package com.cz.springbootMybatisDemo.service;

import com.cz.springbootMybatisDemo.entity.Departments;
import com.cz.springbootMybatisDemo.entity.Students;

import java.util.List;
import java.util.Map;

/**
 * Created 2019-08-07.
 *
 * @author changzheng
 */
public interface DepartmentsService {

    List<Students> queryStuByDept(String dept_name);

    List<Map<String,Object>> queryStuByDept1(String deptName);

    /**
     * 通过id找
     * @param deptId
     * @return
     */
    Departments findById(Integer deptId);

    /**
     * 通过name找
     * @param name
     * @return
     */
    Departments findByName(String name);


    /**
     * 通过type找
     * @param type
     * @return
     */
    Departments findByType(String type);
}
