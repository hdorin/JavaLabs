package lab4;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Catalog {

    private ArrayList<Document> documents = new ArrayList<>(50);


    public void add (Document document){
        this.documents.add(document);
    }

    public void save (String path) {

    }

    public void open (String path) {

        
    }

    public void load (String path) {

    }

    public void list (){
        for (Document document :
                documents) {
            System.out.println(document);
        }
    }
}
