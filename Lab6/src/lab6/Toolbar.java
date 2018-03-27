package lab6;

import javax.swing.*;

public class Toolbar extends JPanel {
    JButton draw=new JButton("Draw");

    public Toolbar() {
        addFunctionality();
        init();
    }

    private void addFunctionality() {
        draw.addActionListener(e -> {
            System.out.println("button actioned");

        });
    }

    private void init() {
        this.add(draw);
        JLabel l1 = new JLabel("Label 1");

        JSpinner f1 = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));
        JSpinner.NumberEditor editor = new JSpinner.NumberEditor(f1,"#");
        f1.setEditor(editor);
        this.add(f1);
        this.add(l1);

        JLabel l2 = new JLabel("Label 1");

        JSpinner f2 = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));
        JSpinner.NumberEditor editor2 = new JSpinner.NumberEditor(f1,"#");
        f1.setEditor(editor2);
        this.add(f2);
        this.add(l2);

    }


}
