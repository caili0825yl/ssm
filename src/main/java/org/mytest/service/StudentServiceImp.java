package org.mytest.service;

import org.mytest.dao.StudentDao;
import org.mytest.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentService")
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public void save(student s) {
        System.out.println(s.getName());
    }

    @Override
    public List<student> findall() {
        return studentDao.findall();
    }
}
