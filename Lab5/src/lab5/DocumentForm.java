package lab5;

import javax.swing.*;
import java.awt.*;

class DocumentForm extends JPanel {
	private static final long serialVersionUID = 1L;
    private JLabel titleLabel = new JLabel("Title of the document");
    private JButton addButton = new JButton("Add to repository");
    CatalogList list;

    DocumentForm(CatalogList list){
            this.list = list;
        init();
    }
    private void init() {
//        addButton.addActionListener()
        this.setLayout(new GridLayout(2, 1));

        JPanel firstPanel = new JPanel(new GridLayout(4,1));

        String title = "<html><font color='black'>" +
                "Add Document" + "</font></html>";
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
        JSpinner yearField = new JSpinner(new SpinnerNumberModel(1959, 1900, 2018, 1));
        JSpinner.NumberEditor editor = new JSpinner.NumberEditor(yearField,"#");
        yearField.setEditor(editor);

        secondPanel.add(yearField);

        addButton.setPreferredSize(new Dimension(10, 10));
        addButton.addActionListener(e -> this.list.addDocument(title_of_doc.getText() + ", " + yearField.getValue() + " [" + path.getText() + ']'));
        addButton.addActionListener(e -> System.out.println(title_of_doc.getText() + ", " + yearField.getValue() + " [" + path.getText() + ']'));

        secondPanel.add(addButton);

        this.add(secondPanel);
    }
    private void addDocument() {
//        frame.list.addDocument("ce mai faci?");
    }
}