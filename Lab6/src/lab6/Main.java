package lab6;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        DrawingFrame frame=new DrawingFrame();
        frame.setLayout(new BorderLayout());
        ControlPanel cPanel=new ControlPanel();
        Canvas canvas=new Canvas();
        frame.add(canvas,BorderLayout.CENTER);
        frame.add(cPanel,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}