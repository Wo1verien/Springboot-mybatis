package com.cz.springbootMybatisDemo.entity;

import lombok.Data;

import java.util.List;

/**
 * Created 2019-08-07.
 *
 * @author changzheng
 */
@Data
public class Departments {

    private Integer deptId;
    private String deptName;
    private String deptType;

//    private List<Students> students;

}
