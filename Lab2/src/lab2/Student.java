package lab2;

import java.util.Collections;
import java.util.Vector;

/**
 * This class is derived from Person
 * It stores the students and their preferences
 * 
 */
public class Student extends Person {
    private Vector<Project> preferences = new Vector <Project>(20);
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
        for (Project project : projects)
            this.preferences.add(project);

        //Collections.addAll(this.preferences, projects);
    }

    /**
     * Gets the list of preferences of the student
     * @return this.preferences The list of preferences of the student
     */
    public Vector<Project> getPreferences() {
        System.out.print(this.getName() + ": [");
        for (Integer i = 0; i < preferences.size(); i++)
            System.out.print(preferences.elementAt(i).toString() + " ");

        System.out.println("]");
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
