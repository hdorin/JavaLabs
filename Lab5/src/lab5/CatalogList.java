package lab5;

import javax.swing.*;
import java.util.Arrays;

public class CatalogList extends JList {
    private DefaultListModel<Object> model = new DefaultListModel<>();
	
    CatalogList() {
        String title = "<html><i><font color='blue'>" + 
		    "Catalog Documents" + "</font></i></hmtl>";
        this.setBorder(BorderFactory.createTitledBorder(title));
        this.setModel(model);        
    }    
    public void addDocument(String item) {
        model.addElement(item);
    }

    public String getDocument() {

        return Arrays.toString(model.getListDataListeners());
    }
}