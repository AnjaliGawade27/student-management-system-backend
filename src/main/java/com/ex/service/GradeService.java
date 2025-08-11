package com.ex.service;

import com.ex.dto.GradeDTO;
import java.util.List;

public interface GradeService 
{
GradeDTO addGrade(GradeDTO gradeDTO);
List<GradeDTO> getAllGrades();
List<GradeDTO> getGradesByStudentId(Long studentId);
GradeDTO getGradeByStudentAndCourse(Long studentId, Long courseId);
GradeDTO getGradeById(Long id);
GradeDTO updateGrade(GradeDTO gradeDTO);
void deleteGrade(Long id);
}