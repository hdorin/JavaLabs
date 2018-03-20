package lab5;

import javax.swing.*;
import java.awt.*;

class DocumentForm extends JPanel {
	private static final long serialVersionUID = 1L;
	private final CatalogFrame frame;
    private JLabel titleLabel = new JLabel("Title of the document");

    DocumentForm(CatalogFrame frame){
        this.frame=frame;
        init();
    }
    private void init() {
//        addButton.addActionListener();
        this.setLayout(new GridLayout(2, 1));

        JPanel firstPanel = new JPanel(new GridLayout(4,1));
//        firstPanel.setPreferredSize(new Dimension(4*100,4*100));



        String title = "<html><i><font color='black'>" +
                "Add Document" + "</font></i></html>";
        this.setBorder(BorderFactory.createTitledBorder(title));

        firstPanel.add(titleLabel);

        JTextField title_of_doc = new JTextField();
        firstPanel.add(title_of_doc);

        JLabel textField2 = new JLabel("Path in the local file system");
        firstPanel.add(textField2);

        JTextField path = new JTextField();
        firstPanel.add(path);

        this.add(firstPanel);

        JPanel secondPanel = new JPanel(new GridLayout(4,1));
        secondPanel.setPreferredSize(new Dimension(100,100));

        JLabel pubyear = new JLabel("Publication Year");
        secondPanel.add(pubyear);
        JSpinner yearField = new JSpinner(new SpinnerNumberModel(1950, 1900, 2017, 1));
        JSpinner.NumberEditor editor = new JSpinner.NumberEditor(yearField,"#");
        yearField.setEditor(editor);

        secondPanel.add(yearField);
        JButton bt = new JButton("Add to repository");
        bt.setPreferredSize(new Dimension(10, 10));

        secondPanel.add(bt);

        this.add(secondPanel);
    }
    private void addDocument() {
        //frame.list.addDocument(...);
    }
}