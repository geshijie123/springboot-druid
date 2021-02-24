package com.gsj.controller;

import com.gsj.bean.Person;
import com.gsj.dao.PersonDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {


    @Resource
    PersonDao personDao;


    @RequestMapping("selectAll")
    public Object selectAll(){
        personDao.save(new Person());
        return personDao.findAll();
    }
}
