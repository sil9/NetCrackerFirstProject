package com.netcracker.selyutin;


import java.util.List;

public interface CourseDao {

    List<Course> findAll();

    Course findById(int id);

    void create(Course course);

    void update(Course course);

    void deleteById(int id);

}
