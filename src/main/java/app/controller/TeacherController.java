/**
 *
 */
package app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.dto.TeacherDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author aneesha.l
 */
@RestController
public class TeacherController {

	/**
	 * Create Teacher
	 *
	 * @return TeacherDTO
	 */
	@ApiOperation(value = "Retrieving all the teachers")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Server error") })
	@RequestMapping(value = "/teachers", method = RequestMethod.GET)
	public List<TeacherDTO> findAllTeachers() {

		System.out.println("in findAllTeachers");

		return getTeachers();
	}

	/**
	 * Create Teacher
	 *
	 * @return TeacherDTO
	 * @throws Exception
	 */
	@ApiOperation(value = "Create Teacher")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "Input message validation failed"),
			@ApiResponse(code = 500, message = "Server error") })
	@RequestMapping(value = "/teachers", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public TeacherDTO createTeacher(@Valid @RequestBody final TeacherDTO teacherDTO) throws Exception {

		if (teacherDTO.getName() != null && teacherDTO.getAddress() != null) {
			teacherDTO.setId(101);
			System.out.println("in createTeacher");
		} else {
			throw new Exception();
		}

		return teacherDTO;
	}

	private List<TeacherDTO> getTeachers() {
		List<TeacherDTO> teacherList = new ArrayList<TeacherDTO>();
		TeacherDTO teacher = new TeacherDTO();
		teacher.setId(101);
		teacher.setName("T1");
		teacher.setAddress("Tvm");
		teacherList.add(teacher);

		teacher = new TeacherDTO();
		teacher.setId(102);
		teacher.setName("T2");
		teacher.setAddress("Klm");
		teacherList.add(teacher);

		teacher = new TeacherDTO();
		teacher.setId(103);
		teacher.setName("T3");
		teacher.setAddress("Ekm");
		teacherList.add(teacher);

		return teacherList;
	}

}
