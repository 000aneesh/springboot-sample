/**
 *
 */
package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.dto.StudentDTO;

/**
 * @author aneesha.l
 */
@Service
public class StudentServiceImpl implements StudentService {

	private List<StudentDTO> getStudents() {
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		StudentDTO student = new StudentDTO();
		student.setId(101);
		student.setName("Aneesh");
		student.setAddress("Tvm");
		student.setBatch("2009");
		studentList.add(student);

		student = new StudentDTO();
		student.setId(102);
		student.setName("Anand");
		student.setAddress("Tvm");
		student.setBatch("2010");
		studentList.add(student);

		student = new StudentDTO();
		student.setId(103);
		student.setName("Ananya");
		student.setAddress("Ekm");
		student.setBatch("2010");
		studentList.add(student);

		return studentList;
	}

	public List<StudentDTO> findAllStudents() {
		System.out.println("in findAllStudents Service");
		return getStudents();
	}

	public StudentDTO createStudent(StudentDTO studentDTO) throws Exception {
		if (studentDTO.getName() != null && studentDTO.getBatch() != null && studentDTO.getAddress() != null) {
			studentDTO.setId(101);
			System.out.println("in createStudent Service");
		} else {
			throw new Exception();
		}
		return studentDTO;
	}

}
