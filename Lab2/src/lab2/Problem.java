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
		for (Integer i = 0; i < this.students.size(); i++) {
			students.elementAt(i).toString();
		}
		for(Integer i = 0; i < this.teachers.size(); i++){
			teachers.elementAt(i).toString();
		}
		return null;
	}

}
