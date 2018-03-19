package lab5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {
    private final JFrame frame;
    private final JPanel controlPanel=new JPanel();
    
    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");

    public ControlPanel(JFrame frame) {
        this.frame = frame;
        init();
        frame.add(controlPanel);
    }
    private void init() {
        controlPanel.add(loadBtn);
        controlPanel.add(saveBtn);
        

    }
}
