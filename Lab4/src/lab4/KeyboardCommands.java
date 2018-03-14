package lab4;

import java.util.ArrayList;

interface KeyboardCommands {
	static ArrayList<Document> documents = new ArrayList<>(50);
	static int objectCounter=-1;
	void createObject(String objectType);
	
	
}
