package lab5;

import javax.swing.*;

public class CatalogList extends JList {
    DefaultListModel<Object> model = new DefaultListModel<>();
	
    CatalogList() {
        String title = "<html><i><font color='blue'>" + 
		    "Catalog Documents" + "</font></i></hmtl>";
        this.setBorder(BorderFactory.createTitledBorder(title));
        this.setModel(model);        
    }    
    public void addDocument(String item) {
        model.addElement(item);
    }
}