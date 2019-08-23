package com.cz.springbootMybatisDemo.service.impl;

import com.cz.springbootMybatisDemo.entity.Students;
import com.cz.springbootMybatisDemo.mapper.StudentsMapper;
import com.cz.springbootMybatisDemo.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created 2019-08-06.
 *
 * @author changzheng
 */
@Service
public class StudentsServiceimpl implements StudentsService {

    @Autowired
    private StudentsMapper studentsMapper;
    @Override
    public Students findById(Integer id) {
        return studentsMapper.findById(id);
    }

    @Override
    public  void insert(Students students){
        studentsMapper.insert(students);
    }

    @Override
    public void update(Students students){
        studentsMapper.update(students);
    }

    @Override
    public void delete(Students students) {
        studentsMapper.delete(students);
    }

    @Override
    public List<Integer> queryDeptIdByNameAndAge(String name, Integer age) {
        return studentsMapper.queryDeptIdByNameAndAge(name,age);
    }

    @Override
    public String queryDeptNameByStId(Integer id) {
        return studentsMapper.queryDeptNameByStId(id);
    }

}
