package org.mytest.service;

import org.mytest.model.student;

import java.util.List;

public interface StudentService {
    public void save(student s);
    public List<student> findall();

}
