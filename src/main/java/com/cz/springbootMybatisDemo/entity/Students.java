package com.cz.springbootMybatisDemo.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created 2019-08-06.
 *
 * @author changzheng
 */
@Data
public class Students implements Serializable {

    private Integer id;
    private String name;
    private int deptId;
    private int age;
    private String sex;
    private int height;
    private Date loginDate;
    private Departments dept;

    public Students(Integer id, String name, int deptId, int age, String sex, int height, Date loginDate) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.loginDate = loginDate;
    }

    public Students() {
    }
}
