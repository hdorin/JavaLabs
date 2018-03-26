package lab6;



import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ControlPanel extends JPanel{
	BufferedImage image;
	JButton saveButton=new JButton("Save");
	JButton loadButton=new JButton("Load");
	JButton resetButton=new JButton("Reset");
	ControlPanel(){
		addFunctionality();
		init();
		
	}
	void addFunctionality() {
			loadButton.addActionListener(e->{
				try {
					image=ImageIO.read(new File("canvas.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			saveButton.addActionListener(e->{
				try {
					ImageIO.write(image, "jpg", new File("canvas.jpg"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			resetButton.addActionListener(e->image=new BufferedImage(100, 200, BufferedImage.TYPE_INT_ARGB));
			
			
			


	}
	void init() {
		this.add(saveButton);
		this.add(loadButton);
		this.add(resetButton);

	}
}
