package lab2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class stores the the participants involved, be them
 * students or teachers. 
 */

class Problem {
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Teacher> teachers = new ArrayList<>();

	/**
	 * Sets the students who are involved 
	 * @param students the list of students involved
	 */
	public void setStudents(Student ... students) {
		this.students.addAll(Arrays.asList(students));
	}
	
	/**
	 * Sets the teachers involved
	 * @param teachers the list of students involved
	 */
	public void setTeachers(Teacher ... teachers) {
		this.teachers.addAll(Arrays.asList(teachers));
	}

	/**
	 * Returns a list of participants 
	 * @return participants in a ArrayList of type Person
	 */
	public ArrayList<Person> getParticipants() {
        ArrayList<Person> people = new ArrayList<>(students);
        people.addAll(teachers);
		return people;
		
	}

	public void getMatching(){

    }

    /**
     * Returns a string with the elements of the object
     * @return string with the students and teachers involved
     */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//        String st = "";
		for (Student student : students) {
            System.out.println(student.getName() + student.getPreferences());
//            st += student;
		}
		System.out.println();
		for (Teacher teacher : this.teachers) {
            System.out.println(teacher.getName() + teacher.getPreferences());
//            st += teacher;
        }
        return "";
	}
}
