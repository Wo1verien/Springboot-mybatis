package com.cz.springbootMybatisDemo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created 2019-08-09.
 *
 * @author changzheng
 */
@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value = IOException.class)
    public Map ioExceptionHandler(IOException i){
        Map map = new HashMap();
        map.put("cause",i.getCause());
        map.put("msg",i.getMessage());
        return map;
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ModelAndView runtimeExceptionHandler(RuntimeException e) {
        e.printStackTrace();
        return new ModelAndView("error");
    }



}
