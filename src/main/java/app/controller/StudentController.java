/**
 *
 */
package app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.StudentDTO;
import app.service.StudentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author aneesha.l
 */
@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;

	/**
	 * Create Student
	 *
	 * @return StudentDTO
	 */
	@ApiOperation(value = "Retrieving all the students")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Server error") })
	@GetMapping
	public List<StudentDTO> findAllStudents() {

		System.out.println("in findAllStudents Controller");

		return studentService.findAllStudents();
	}

	/**
	 * Create Student
	 *
	 * @return StudentDTO
	 * @throws Exception
	 */
	@ApiOperation(value = "Create Student")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "Input message validation failed"),
			@ApiResponse(code = 500, message = "Server error") })
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentDTO createStudent(@Valid @RequestBody final StudentDTO studentDTO) throws Exception {

		studentService.createStudent(studentDTO);

		return studentDTO;
	}

}
