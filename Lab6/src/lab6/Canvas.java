package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Canvas extends JPanel  implements MouseListener{

	 Image image;

    public void paintComponent (Graphics g){
        if(image == null) return;
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);

        g.drawImage(image, 50, 50, this);

        
    }

    Canvas() {
//        this.graphics = (Graphics2D) getGraphics();
        addMouseListener(this);
        this.setSize(300,300);
        this.setLayout(null);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics2D g = (Graphics2D) getGraphics();
        g.setColor(Color.BLUE);
//        g.fillOval(e.getX(), e.getY(), 40, 40);
        g.fillRect(e.getX(), e.getY(), 10,40);
    }



    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

  }
