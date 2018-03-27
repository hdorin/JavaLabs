package lab6;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class DrawingFrame extends JFrame {

    public DrawingFrame(){
        setTitle("ImageTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //frame.setLayout(new BorderLayout());
        
        Canvas canvas=new Canvas();
        ControlPanel cPanel=new ControlPanel(canvas);
        //Toolbar toolbar = new Toolbar();
        add(canvas, BorderLayout.CENTER);
        add(cPanel,BorderLayout.SOUTH);
        
        //frame.pack();
 

    }

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
}
