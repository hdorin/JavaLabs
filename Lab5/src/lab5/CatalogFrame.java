package lab5;

import java.awt.*;

import javax.swing.*;

class CatalogFrame extends JFrame {
	private static final long serialVersionUID = 1L;
    //aici adaugi tu, Mihai

    private DocumentForm form = new DocumentForm(this);
    CatalogList catalogList = new CatalogList();
    private ControlPanel controlPanel = new ControlPanel(this);
   	
    CatalogFrame() {
    	super("Visual Document Manager");
        this.setLayout(new GridLayout(3, 1));

        this.add(form);

        this.add(catalogList);
        this.add(controlPanel);

        init();
    }
    private void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setSize(500,500);
        this.pack();
        
    }
	
}
