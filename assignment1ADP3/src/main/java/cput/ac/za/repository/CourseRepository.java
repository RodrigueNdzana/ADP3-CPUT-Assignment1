package za.ac.cput.repository;

import za.ac.cput.domain.Course;

import java.util.HashSet;
import java.util.Set;

/*   CourseRepository.java
     Repository for the Course
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2022
*/
public class CourseRepository implements ICourseRepository {
    private static CourseRepository repository = null; // Initialize the repo to null
    private Set<Course> courseDB = null;

    private CourseRepository() {
        courseDB = new HashSet<Course>(); // storing our data in a form of a set
    }

    public static CourseRepository getRepository() {
        // checking if the repository is null , if that is a case(which is true) create a repository
        if (repository == null) {
            repository = new CourseRepository();
        }
        return repository;
    }


    @Override
    public Course create(Course course) {
        //doing some testing to check if I was successful in adding Course to my Set
        boolean successful = courseDB.add(course);
        if (!successful) {
            return null; // if no course is added
        }
        return course;
    }

    @Override
    public Course read(String courseCode) {
        for (Course e : courseDB) {

            if (e.getCourse_code().equals(courseCode)) {
                return e;
            }
            return e;
        }
        return null;
    }

    @Override
    public Course update(Course course) {
        // read first the value you want to update
        Course previousCourse = read(course.getCourse_code());
        if (previousCourse == null) { // which is true
            courseDB.remove(previousCourse); // remove the previous course
            courseDB.add(course); // add a course with a new course_Code
        }
        return course; // if there is nothing to update
    }

    @Override
    public boolean delete(String course_code) {
        // read the value to delete
        Course courseToDelete = read(course_code);
        if (courseToDelete == null)
            return false;
        courseDB.remove(courseToDelete);
        return true;
    }

    @Override
    public Set<Course> getAll() {
        return courseDB;
    }
}
