package lab2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class is derived from Person
 * It stores the students and their preferences
 * 
 */
public class Student extends Person {
    private ArrayList<Project> preferences = new ArrayList<>();
    private Integer nrOfPref;

    /**
     * Constructor for the class Student
     * @param name the name of the student
     * @param email the email of the student
     */
    public Student(String name, String email){
        super(name,email);
    }

    /**
     * Sets the preferences for the student
     * @param projects List of projects preferred by the student
     */
    public void setPreferences(Project ... projects) {
        this.nrOfPref = projects.length;
        this.preferences.addAll(Arrays.asList(projects));

    }

    /**
     * Gets the list of preferences of the student
     * @return this.preferences The list of preferences of the student
     */
    public ArrayList<Project> getPreferences() {
//        System.out.print(" [");
//
//        for(Project project: preferences)
//            System.out.print(project.toString() + " ");
//        System.out.println("]");
        return this.preferences;
    }

    /**
     * Getter for the variable nrOfPref
     * @return this.nrOfPref;
     */
    public Integer getNrOfPref() {
        return this.nrOfPref;
    }

    /**
     * Overrides the toString function
     * Returns a list with the elements
     * @return the 
     */
    @Override
    public String toString(){
        return  this.getName() +  ":" + this.getPreferences();
    }

    /**
     * Overrides the equals function
     * @return a boolean value  
     */
    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null)
            return false;
        if(getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return this.getName().equals(student.getName()) && this.getPreferences().equals(student.getPreferences());
    }
}
