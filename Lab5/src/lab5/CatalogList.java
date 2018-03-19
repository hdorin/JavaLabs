package lab5;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class CatalogList extends JList {
	private static final long serialVersionUID = 1L;
	DefaultListModel model = new DefaultListModel();
	JList catalogList = new JList(model);
	
    public CatalogList(JFrame frame) {
        String title = "<html><i><font color='blue'>" + 
		    "Catalog Documents" + "</font></i></hmtl>";
        
        frame.add(catalogList);
    }    
    public void addDocument(String item) {
        //catalogList.addElement(item);
    }
}	
