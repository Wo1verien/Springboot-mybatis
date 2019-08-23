package com.cz.springbootMybatisDemo.mapper;

import com.cz.springbootMybatisDemo.entity.Departments;
import com.cz.springbootMybatisDemo.entity.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created 2019-08-07.
 *
 * @author changzheng
 */
@Mapper
@Repository
public interface DepartmentsMapper {

    List<Students> queryStuByDept(@Param("deptName") String deptName);
    List<Map<String,Object>> queryStuByDept1(@Param("deptName") String deptName);//根据dept的name得到stu的id和name


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
