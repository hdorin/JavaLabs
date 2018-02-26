package lab2;

import java.util.Vector;

public class Profesor extends Person {
    private Vector<String> prefList;
    private Integer nrOfPref;
    private Integer upperBound;

    public Profesor(String name, String email, String sex, Integer age, Vector<String> prefList, Integer nrOfPref,
                    Integer upperBound){
        super(name,email,sex,age);

        this.prefList = new Vector<String>(nrOfPref);
        for(Integer i = 0; i < prefList.size(); i++)
            this.prefList.set(i, prefList.get(i));
        this.nrOfPref = nrOfPref;
        this.upperBound = upperBound;

    }


    public void printPrefList(){
        for (int i = 0;i < nrOfPref; i++)
            System.out.println(prefList.get(i));
    }

    public Integer getNrOfPref() {
        return nrOfPref;
    }

    public Integer getUpperBound() {
        return upperBound;
    }

    public void setNrOfPref(Integer nrOfPref) {
        this.nrOfPref = nrOfPref;
    }

    public void setPrefList(Vector<String> prefList) {
        this.prefList = prefList;
    }

    public void setUpperBound(Integer upperBound) {
        this.upperBound = upperBound;
    }

    public Vector<String> getPrefList() {
        return this.prefList;
    }
}
