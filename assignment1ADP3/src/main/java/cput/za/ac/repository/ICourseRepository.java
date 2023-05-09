package cput.za.ac.repository;

import cput.za.ac.domain.Course;

import java.util.Set;

public interface ICourseRepository extends IRepository<Course, String> {
    // This inherit the method created in the IRepository create , read,update and delete
    //Which got implemented in the CourseRepository
    public Set<Course> getAll();
}
