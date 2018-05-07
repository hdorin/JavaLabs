package lab5;

import javax.swing.*;
import java.util.Arrays;

class CatalogList extends JList {
    private DefaultListModel<Object> model = new DefaultListModel<>();
	
    CatalogList() {
        String title = "<html><i><font color='blue'>" + 
		    "Catalog Documents" + "</font></i></hmtl>";
        this.setBorder(BorderFactory.createTitledBorder(title));
        this.setModel(model);        
    }    
    void addDocument(String item) {
        model.addElement(item);
    }

    String getDocument() {

        return Arrays.toString(model.getListDataListeners());
    }
}