package lab2;

import java.util.Vector;

public class Teacher extends Person {
    private Vector<Student> preferences;
    private Integer nrOfPref;

    public Teacher(String name, String email) {
        super(name, email);
    }

    public void setPreferences(Student ... students){
        this.nrOfPref = students.length;
        for (Student student: students) {
            this.preferences.add(student);
        }
    }

    public Vector<Student> getPreferences() {
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
