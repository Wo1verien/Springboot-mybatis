package com.cz.springbootMybatisDemo.mapper;

import com.cz.springbootMybatisDemo.entity.Students;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created 2019-08-06.
 *
 * @author changzheng
 */
@Mapper
@Repository
public interface StudentsMapper {
    /**
     * 通过id找
     * @param id
     * @return
     */
    Students findById(Integer id);

    /**
     * 插入students
     * @param students
     * @return
     */
    void insert(Students students);

    /**
     * 更新
     * @param students
     */
    void update(Students students);

    /**
     * 删除
     * @param students
     */
    void delete(Students students);


    /**
     * 根据name和age查询学生的deptId
     * @param name,age
     * @return
     */
    List<Integer> queryDeptIdByNameAndAge(String name, int age);

    /**
     * 通过学生id得到学生部门name
     * @param id
     * @return
     */
    String queryDeptNameByStId(Integer id);

    Students findByName(String name);



}
