package lab2;

import java.util.Vector;

public class Student extends Person {
    private Vector prefList;
    private Integer nrOfPref;
    public Student(){

    }

    public Student(Vector prefList, Integer nrOfPref){
        this.nrOfPref = nrOfPref;
        this.prefList = prefList;
    }

    public void printPrefList(){
        for (int i = 0;i < nrOfPref; i++)
            System.out.println(prefList.get(i));
    }


}
