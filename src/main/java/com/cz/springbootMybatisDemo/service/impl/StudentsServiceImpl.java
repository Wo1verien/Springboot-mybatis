package com.cz.springbootMybatisDemo.service.impl;

import com.cz.springbootMybatisDemo.entity.Students;
import com.cz.springbootMybatisDemo.mapper.StudentsMapper;
import com.cz.springbootMybatisDemo.service.StudentsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created 2019-08-06.
 *
 * @author changzheng
 */
@Service
@Slf4j
public class StudentsServiceImpl implements StudentsService {

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


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void testTransaction() throws Exception {
        try {
            Students students = new Students();
            students.setAge(1);
            students.setName("frist");
            studentsMapper.insert(students);
            int i = 1/0;
            Students students1 = new Students();
            students1.setAge(2);
            students1.setName("second");
            studentsMapper.insert(students1);
        } catch (Exception e){
            log.error("发生异常",e);
            throw new Exception("发生异常");
        }
    }


}
