package cput.za.ac.repository;


/*IStudentRepository .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/


import cput.za.ac.domain.Student;

import java.util.Set;

public interface IStudentRepository extends ISRepository<Student, String> {
    public Set<Student> getAll();
}
