package lab6;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        DrawingFrame frame=new DrawingFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        ControlPanel cPanel=new ControlPanel();
        Canvas canvas=new Canvas();
        Toolbar toolbar = new Toolbar();
        frame.add(canvas, BorderLayout.CENTER);
        frame.add(cPanel,BorderLayout.SOUTH);
        frame.add(toolbar, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
    }
}