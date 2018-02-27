package lab2;

import java.util.Collections;
import java.util.Vector;

public class Student extends Person {
    private Vector<Project> preferences;
    private Integer nrOfPref;

    public Student(String name, String email){
        super(name,email,"M",25);
    }

    public void setPreferences(Project ... projects) {
        this.nrOfPref = projects.length;
        for (Project project : projects)
            this.preferences.add(project);

        //Collections.addAll(this.preferences, projects);
    }

    public Vector<Project> getPreferences() {
        return this.preferences;
    }

    public Integer getNrOfPref() {
        return this.nrOfPref;
    }

    @Override
    public String toString(){
        return  this.getName() +  ":" + this.preferences;
    }

    @Override
    public boolean equals(Object o){
        if(this == student)
            return true;
        if(student == null)
            return false;
        if(getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return this.getName().equals(student.getName()) && this.getPreferences().equals(student.getPreferences());
    }
}
