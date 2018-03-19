package lab5;

import java.awt.Frame;

import javax.swing.JFrame;

public class CatalogFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	DocumentForm form;
    CatalogList list;
    ControlPanel control;       
   	
    public CatalogFrame() {
        super("Visual Document Manager");
        init();
    }
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		// Create the window (frame)
		Frame f = new Frame("O fereastra");
		f.setVisible(true);
	}	
}
