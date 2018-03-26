package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Canvas extends JPanel {

    private Graphics2D graphics;
    private Integer radius;
    private Integer sides;

    public void drawShapeAt(int x, int y) {
        Random rand = new Random();
        graphics.setColor(new Color(rand.nextInt(0xFFFFFF)));
//		...
        graphics.fill(new RegularPolygon(x, y, radius, sides));

        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                drawShapeAt(e.getX(), e.getY());
            }
        });
    }
}
