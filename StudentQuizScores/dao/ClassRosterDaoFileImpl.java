package classroster.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import classroster.dto.Student;

public class ClassRosterDaoFileImpl implements ClassRosterDao {
	private Map<String, Student> students = new HashMap<>();
	@Override
	public Student addStudent(String studentId, Student student) {
	    Student prevStudent = students.put(studentId, student);
	    return prevStudent;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return new ArrayList<Student>(students.values());
	}

	@Override
	public Student getStudent(String studentId) {
		// TODO Auto-generated method stub
		return students.get(studentId);
	}

	@Override
	public Student removeStudent(String studentId) {
		// TODO Auto-generated method stub
		Student removedStudent = students.remove(studentId);
	    return removedStudent;
	}

}
