package lab4;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;

import java.io.Serializable;
import java.util.ArrayList;


public class Catalog implements Serializable{
	private static final long serialVersionUID = 1L;
	private ArrayList<Document> documents = new ArrayList<>(50);


    public void add (Document document){
        this.documents.add(document);
    }

    public void save (String path) {
    	FileOutputStream fos;
		try {
			fos = new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			throw new InvalidInputException("Invalid path!");
		}
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(fos);
		} catch (IOException e1) {
			throw new InvalidInputException("Could not initialize ObjectOutputStream!");
		}
    	try {
			out.writeObject(documents);
		} catch (IOException e) {
			throw new InvalidInputException("Could not serialize object!");
		}
    	try {
			out.flush();
		} catch (IOException e) {
			throw new InvalidInputException("Could not flush buffer!");
		}
    	try {
			out.close();
		} catch (IOException e) {
			throw new InvalidInputException("Could not close ObjectOutputStream!");
		}
    }

    public void open (String path) {
    }

    public void load (String path) {
    	FileInputStream fos;
		try {
			fos = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			throw new InvalidInputException("Invalid path!");
		}
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(fos);
		} catch (IOException e1) {
			throw new InvalidInputException("Could not initialize ObjectOutputStream!");
		}
    	try {
    		documents=(ArrayList<Document>) in.readObject();
		} catch (IOException e) {
			throw new InvalidInputException("Could not serialize object!");
		}
    	try {
			in.close();
		} catch (IOException e) {
			throw new InvalidInputException("Could not close ObjectOutputStream!");
		}
    }

    public void list (){
        for (Document document : documents) {
            System.out.println(document);
        }
    }
}
