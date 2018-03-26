package lab5;

import javax.swing.*;
import java.awt.*;

class CatalogFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	CatalogList catalogList = new CatalogList();
    private DocumentForm form = new DocumentForm(catalogList);
    private ControlPanel controlPanel = new ControlPanel(this);

    CatalogFrame() {
    	super("Visual Document Manager");
        this.setLayout(new GridLayout(3, 1));

        this.add(form);
//        this.catalogList.addDocument("mihai este cel mai tare");
        this.add(catalogList);
        this.add(controlPanel);

        init();
    }
    private void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        
    }
	
}
