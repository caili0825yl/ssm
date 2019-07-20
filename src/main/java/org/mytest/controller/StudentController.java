package org.mytest.controller;

import org.mytest.model.student;
import org.mytest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentService studentService;
    @ResponseBody
    @RequestMapping("/save")
    public student   save(){
        List<student> a=studentService.findall();
        a.get(0);
       return a.get(0);
    }
}
