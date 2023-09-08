package cput.za.ac.Service.impl;

import cput.za.ac.domain.Course;
import cput.za.ac.factory.CourseFactory;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class CoursesServiceImplTest {

    @Autowired
    private CoursesServiceImpl service;
    private static Course course = CourseFactory.createCourse("219384096", "ADT3", "Application Development Theory 3","Ms F.Allie","Information technology","Room 1.19", new ArrayList<>());

    @Test
    void a_create() {
        Course created = service.create(course);
        assertEquals(course.getCourse_code(), created.getCourse_code());
        System.out.println("Created: "+ created);
    }

    @Test
    void b_read() {
        Course read = service.read(course.getCourse_code());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Course newCourse = new Course.Builder().copy(course).setCourse_Name("ADT 3")
                .setClassName("room 1.23")
                .setEducator("MR Kruben").build();
        Course updated =service.update(newCourse);
        assertEquals(newCourse.getCourse_Name(), updated.getCourse_Name());
        assertEquals(newCourse.getClassName(), updated.getClassName());
        assertEquals(newCourse.getEducator(), updated.getEducator());
        System.out.println("Updated" + updated);
    }

    @Test
    @Disabled
    void e_delete() {
    }

    @Test
    void d_getAll() {
        System.out.println("Get all Courses: ");
        System.out.println(service.getAll());
    }
}
