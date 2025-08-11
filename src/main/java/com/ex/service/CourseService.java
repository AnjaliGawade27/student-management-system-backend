package com.ex.service;

import java.util.List;
import com.ex.dto.CourseDTO;

public interface CourseService 
{
CourseDTO addCourse(CourseDTO courseDto);
List<CourseDTO> getAllCourses();
CourseDTO getCourseById(Long id);
CourseDTO updateCourseById(Long id, CourseDTO courseDto);
void deleteCourseById(Long id);
}