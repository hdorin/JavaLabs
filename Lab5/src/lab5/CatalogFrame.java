package lab5;

import javax.swing.JFrame;

public class CatalogFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	DocumentForm form;
    CatalogList list;
    ControlPanel controlPanel;    
    JFrame mainFrame;
   	
    public CatalogFrame() {
        mainFrame = new JFrame("Visual Document Manager");
        controlPanel=new ControlPanel(mainFrame);
        init();
    }
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		/*
		f.add(new JButton("Hello"));
		JPanel panel = new JPanel();
		panel.add(new JLabel("Name:")); 
		panel.add(new JButton("B1"));
		panel.add(new JTextField());
		f.add(panel);*/
		mainFrame.pack();
		mainFrame.setVisible(true);
		
	}	
}
