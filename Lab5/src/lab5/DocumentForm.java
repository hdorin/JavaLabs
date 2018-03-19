package lab5;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class DocumentForm extends JPanel {
	private static final long serialVersionUID = 1L;
	private final CatalogFrame frame;
    JLabel titleLabel = new JLabel("Title of the document");

    JSpinner yearField = new JSpinner(new SpinnerNumberModel(1950, 1900, 2017, 1));
    	private void init() {               
        //addButton.addActionListener(...);
    }
    private void addDocument() {
        //frame.list.addDocument(...);
    }
}