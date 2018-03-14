package lab4;

import java.awt.Desktop;
import java.io.DataOutputStream;
import java.io.File;
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


    public void add (Document document) throws InvalidInputException {
        if(document==null) {
        	throw new InvalidInputException("No document specified!");
        }
        this.documents.add(document);
    }

    public void save (String path) throws InvalidInputException {
    	FileOutputStream fos;
		try {
			fos = new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			throw new InvalidInputException("Invalid path!",e);
		}
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(fos);
		} catch (IOException e1) {
			
			throw new InvalidInputException("Could not initialize ObjectOutputStream!",e1);
		}
    	try {
			out.writeObject(documents);
		} catch (IOException e) {
			throw new InvalidInputException("Could not serialize object!",e);
		}
    	try {
			out.flush();
		} catch (IOException e) {
			throw new InvalidInputException("Could not flush buffer!",e);
		}
    	try {
			out.close();
		} catch (IOException e) {
			throw new InvalidInputException("Could not close ObjectOutputStream!",e);
		}
    }

    public void open (Document doc) throws InvalidInputException {
    	File f = new File(doc.getlocalPath());
    	Desktop desktop = Desktop.getDesktop();
    	try {
			desktop.open(f);
		} catch (IOException e) {
			throw new InvalidInputException("Could not open file!",e);
		}
    }

    public void load (String path) throws InvalidInputException {
    	FileInputStream fos;
		try {
			fos = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			throw new InvalidInputException("Invalid path!",e);
		}
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(fos);
		} catch (IOException e1) {
			throw new InvalidInputException("Could not initialize ObjectOutputStream!");
		}
    	try {
    		documents=(ArrayList<Document>) in.readObject();
		} catch (ClassNotFoundException e) {
			throw new InvalidInputException("Class not found!",e);
		} catch (IOException e) {
			throw new InvalidInputException("Could not deserialize!",e);
		}
    	try {
			in.close();
		} catch (IOException e) {
			throw new InvalidInputException("Could not close ObjectOutputStream!",e);
		}
    }

    public void list (){
        for (Document document : documents) {
            System.out.println(document);
        }
    }
}
