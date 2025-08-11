package com.ex.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ex.model.Attendance;
import com.ex.model.Course;
import com.ex.model.Student;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> 
{
List<Attendance> findByStudent(Student student);
List<Attendance> findByCourseAndAttendanceDate(Course course, LocalDate date);
void deleteByStudentId(Long studentId);

}