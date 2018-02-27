package lab2;

import java.util.ArrayList;
import java.util.Vector;

class Problem {
	private Vector<Student> students = new Vector<Student>(20);
	private Vector<Teacher> teachers = new Vector<Teacher>(20);

	public void setStudents(Student ... students) {
        for (Student student: students) {
            this.students.add(student);
        }
	}

	public void setTeachers(Teacher ... teachers) {
		for (Teacher teacher: teachers) {
            this.teachers.add(teacher);
        }
	}

	public Vector<Person> getParticipants() {
		return null;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Vector<String> strings = new Vector<>(40);
		for (Integer i = 0; i < this.students.size(); i++)
			strings.add(students.elementAt(i).toString());
		return null;
	}

}
