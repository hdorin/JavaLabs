package lab2;

import java.util.ArrayList;
import java.util.Vector;

/**
 * This class stores the the participants involved, be them
 * students or teachers. 
 */

class Problem {
	private Vector<Student> students = new Vector<Student>(20);
	private Vector<Teacher> teachers = new Vector<Teacher>(20);

	/**
	 * Sets the students who are involved 
	 * @param students the list of students involved
	 */
	public void setStudents(Student ... students) {
        for (Student student: students) {
            this.students.add(student);
        }
	}
	
	/**
	 * Sets the teachers involved
	 * @param teachers the list of students involved
	 */
	public void setTeachers(Teacher ... teachers) {
		for (Teacher teacher: teachers) {
            this.teachers.add(teacher);
        }
	}
	
	/**
	 * Returns a list of participants 
	 * @return participants in a vector of type Person
	 */
	public Vector<Person> getParticipants() {
		return null;
		
	}

	@Override
	/**
	 * Returns a string with the elements of the object 
	 * @return string with the students and teachers involved
	 */
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
