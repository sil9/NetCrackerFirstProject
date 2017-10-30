package com.netcracker.selyutin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CourseDaoImplTest {

    private CourseDao courseDao = CourseDaoImpl.getInstance();

    private static final int TEST_ID = 999;
    private static final String TEST_NAME = "TestName";
    private static final String TEST_TRAINER_SURNAME = "TestTrainerSurname";
    private static final String TEST_TRAINER_NAME = "TestTrainerName";
    private static final String TEST_TRAINER_PATRONYMIC = "TestTrainerPatronymic";
    private static final int TEST_HOUR_COUNT = 100;

    @Before
    public void setUp() throws Exception {
        Course course = initCourse();
        courseDao.create(course);
    }

    @After
    public void tearDown() throws Exception {
        courseDao.deleteById(TEST_ID);
    }

    @Test
    public void findAll() throws Exception {
        List<Course> courses = courseDao.findAll();
        assertNotNull(courses);
    }

    @Test
    public void findById() throws Exception {
        Course course = courseDao.findById(TEST_ID);
        assertNotNull(course);
        assertEquals(TEST_ID, course.getId());
    }

    @Test
    public void create() throws Exception {
        Course course = initCourse();
        course.setId(TEST_ID + 1);
        courseDao.create(course);
        Course courseFromDatabase = courseDao.findById(TEST_ID + 1);
        courseDao.deleteById(TEST_ID + 1);
        assertEquals(course, courseFromDatabase);
    }

    @Test
    public void update() throws Exception {
        Course course = courseDao.findById(TEST_ID);
        course.setName("ChangedName");
        courseDao.update(course);
        assertEquals("ChangedName", course.getName());
    }

    @Test
    public void deleteById() throws Exception {
        Course course = initCourse();
        course.setId(TEST_ID + 1);
        courseDao.create(course);
        courseDao.deleteById(course.getId());
        Course courseFromDatabase = courseDao.findById(course.getId());
        assertNull(courseFromDatabase.getName());
    }

    private Course initCourse() {
        Course course = new Course();
        course.setId(TEST_ID);
        course.setName(TEST_NAME);
        course.setTrainerSurname(TEST_TRAINER_SURNAME);
        course.setTrainerName(TEST_TRAINER_NAME);
        course.setTrainerPatronymic(TEST_TRAINER_PATRONYMIC);
        course.setHourCount(TEST_HOUR_COUNT);
        return course;
    }

}