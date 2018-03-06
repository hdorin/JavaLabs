package lab2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class derives the abstract class Person
 * It stores the teachers and their preferences
 */
public class Teacher extends Person {
    private ArrayList<Student> preferences = new ArrayList<>();
    private Integer nrOfPref;

    /**
     * Class constructor
     * @param name the name of the teacher
     * @param email the email of the teacher
     */
    public Teacher(String name, String email) {
        super(name, email);
    }

    public void setPreferences(Student ... students){
        this.nrOfPref = students.length;
        this.preferences.addAll(Arrays.asList(students));
    }

    public ArrayList<Student> getPreferences() {
//        System.out.print(this.getName() + ": [");
//        for (Student preference : preferences)
//            System.out.print(preference.getName() + " ");
//
//        System.out.println("]");
        return this.preferences;
    }

    public Integer getNrOfPref() {
        return this.nrOfPref;
    }

    @Override
    public String toString(){
        return  this.getName() +  ":" + this.getPreferences();
    }
    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null)
            return false;
        if(getClass() != o.getClass())
            return false;
        Teacher student = (Teacher) o;
        return this.getName().equals(student.getName()) && this.getPreferences().equals(student.getPreferences());
    }
}
