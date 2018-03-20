package lab5;

import java.awt.*;

import javax.swing.*;

class CatalogFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private DocumentForm form;
    private CatalogList catalogList;
    private ControlPanel controlPanel;
   	
    CatalogFrame() {
    	super("Visual Document Manager");
        this.setLayout(new GridLayout(3, 1));
        //aici adaugi tu, Mihai

        form = new DocumentForm(this);
        this.add(form);

        catalogList=new CatalogList();
        this.add(catalogList);
        controlPanel=new ControlPanel(this);
        this.add(controlPanel);

        init();
    }
    private void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setSize(500,500);
        this.pack();
        
    }
	
}
