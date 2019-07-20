package org.mytest.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mytest.model.student;

import java.util.List;

public interface StudentDao {
    @Select("select * from student")
    public List<student> findall();
    @Insert("insert into student(id,name) values(#{id},#{name})")
    public void save(student s);
}
