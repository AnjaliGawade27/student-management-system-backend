package com.ex.repository;

import com.ex.model.Course;
import com.ex.model.Enrollment;
import com.ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> 
{
List<Enrollment> findByStudent(Student student);
boolean existsByStudentAndCourse(Student student, Course course);
void deleteByStudentId(Long studentId);
}