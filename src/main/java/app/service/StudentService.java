package app.service;

import java.util.List;

import app.dto.StudentDTO;

public interface StudentService {

	List<StudentDTO> findAllStudents();

	StudentDTO createStudent(StudentDTO studentDTO) throws Exception;
}
