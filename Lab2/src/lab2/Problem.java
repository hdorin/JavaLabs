package lab2;

import java.util.Vector;

class Problem {
	private Vector<Student> students;
	private Vector<Teacher> teachers;

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

	public String[] getParticipants() {
		return students;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + this.students + this.teachers;
	}

}
