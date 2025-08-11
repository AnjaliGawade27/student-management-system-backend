package com.ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ex.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}