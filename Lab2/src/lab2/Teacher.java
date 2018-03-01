package lab2;

import java.util.Vector;

/**
 * This class derives the abstract class Person
 * It stores the teachers and their preferences
 */
class Teacher extends Person {
    private Vector<Student> preferences = new Vector<Student>(20);
    //folosit List 
    private Integer nrOfPref;

    /**
     * Class constructor
     * @param name the name of the teacher
     * @param email the email of the teacher
     */
    public Teacher(String name, String email) {
        super(name, email);
    }

    /**
     * Setter for the vector preferences
     * @param students
     */
    public void setPreferences(Student ... students){
        this.nrOfPref = students.length;
        for (Student student: students) {
            this.preferences.add(student);
        }
    }
    /**
     * Getter for the vector preferences
     * @return this.preferences
     */
    public Vector<Student> getPreferences() {
        System.out.print(this.getName() + ": [");
        for (Integer i = 0; i < preferences.size(); i++)
            System.out.print(preferences.elementAt(i).getName() + " ");

        System.out.println("]");
        return this.preferences;
    }

    /**
     * Getter for NrOfPref
     * @return this.nrOfPref
     */
    public Integer getNrOfPref() {
        return this.nrOfPref;
    }

    /**
     * Overrides the function toString
     * Returns a list with the elements
     * @return 
     */
    @Override
    public String toString(){
        return  this.getName() +  ":" + this.getPreferences();
    }
    
    /**
     * Overrides the function equals
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
        Teacher student = (Teacher) o;
        return this.getName().equals(student.getName()) && this.getPreferences().equals(student.getPreferences());
    }
}
