package lab5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ControlPanel extends JPanel {
	private final CatalogFrame catalogFrame;
    
    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");

    ControlPanel(CatalogFrame catalogFrame) {
    	this.catalogFrame=catalogFrame;
        init();
        
    }
    private void init() {
        this.add(loadBtn);
        this.add(saveBtn);
    }
}
