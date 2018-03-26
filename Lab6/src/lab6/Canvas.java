package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Canvas extends JPanel implements MouseListener {

//    private Graphics2D graphics;
//
//    public void drawShapeAt(int x, int y) {
//        super.paintComponent(graphics);
//        Random rand = new Random();
//        graphics.setColor(new Color(rand.nextInt(0xFFFFFF)));
////          ...
//        Integer radius = 5;
//        Integer sides = 4;
//        graphics.fill(new RegularPolygon(x, y, radius, sides));
//
//        this.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                drawShapeAt(e.getX(), e.getY());
//            }
//        });
//
//    }

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
