package com.cz.springbootMybatisDemo.service;

import com.cz.springbootMybatisDemo.entity.Students;

import java.util.List;

/**
 * Created 2019-08-06.
 *
 * @author changzheng
 */
public interface StudentsService {
    Students findById(Integer id);

    void insert(Students students);

    void update(Students students);

    void delete(Students students);

    List<Integer> queryDeptIdByNameAndAge(String name, Integer age);

    String queryDeptNameByStId(Integer id);
}