package lab2;

import java.util.Vector;

public class Student extends Person {
    private Vector<String> prefList;
    private Integer nrOfPref;
    //public Student(){
    //
    //}

    public Student(String name, String email, String sex, Integer age, Vector<String> prefList, Integer nrOfPref){
        super(name,email,sex,age);

        this.nrOfPref = nrOfPref;
        for(Integer i = 0; i  < prefList.size(); i++)
            this.prefList.set(i,prefList.get(i));

    }

    public void printPrefList(){
        for (int i = 0;i < nrOfPref; i++)
            System.out.println(prefList.get(i));
    }

    public void setPrefList(Vector<String> prefList) {
        this.prefList = prefList;
    }

    public void setNrOfPref(Integer nrOfPref) {
        this.nrOfPref = nrOfPref;
    }

    public Integer getNrOfPref() {
        return nrOfPref;
    }

    public Vector<String> getPrefList() {
        return this.prefList;
    }
}
