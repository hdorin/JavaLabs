package lab5;


import lab4.Catalog;

import javax.swing.*;

class ControlPanel extends JPanel {
	private final CatalogFrame catalogFrame;
    
    private JButton loadBtn = new JButton("Load");
    private JButton saveBtn = new JButton("Save");

    ControlPanel(CatalogFrame catalogFrame) {
    	this.catalogFrame=catalogFrame;
        init();

    }


    private void init() {
        this.add(loadBtn);
        this.add(saveBtn);

        Catalog c = new Catalog();

        loadBtn.addActionListener(e -> System.out.println(catalogFrame.catalogList.getDocument()));
        loadBtn.addActionListener(e -> System.out.println(catalogFrame.getComponentCount()));

    }
}
