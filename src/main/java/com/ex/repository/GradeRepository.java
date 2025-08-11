package com.ex.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ex.model.Course;
import com.ex.model.Grade;
import com.ex.model.Student;

public interface GradeRepository extends JpaRepository<Grade, Long> 
{
List<Grade>findByStudent(Student student);
Grade findByStudentAndCourse(Student student,Course course);
void deleteByStudentId(Long studentId);


}