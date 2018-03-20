package lab5;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class CatalogFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	DocumentForm form;
    CatalogList catalogList;
    ControlPanel controlPanel;    
   	
    public CatalogFrame() {
    	super("Visual Document Manager");
        this.setLayout(new GridLayout(2, 2));
        //aici adaugi tu, Mihai
        catalogList=new CatalogList();
        
        this.add(catalogList);
        controlPanel=new ControlPanel(this);
        this.add(controlPanel);
        //controlPanel=new ControlPanel(mainFrame);
        
        init();
    }
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        
    }
	
}
