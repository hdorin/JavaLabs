package lab5;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class CatalogList extends JList {
	private static final long serialVersionUID = 1L;
	DefaultListModel model = new DefaultListModel<>();
	
    public CatalogList() {
        String title = "<html><i><font color='blue'>" + 
		    "Catalog Documents" + "</font></i></hmtl>";
        this.setBorder(BorderFactory.createTitledBorder(title));
        this.setModel(model);        
    }    
    public void addDocument(String item) {
        model.addElement(item);
    }
}	