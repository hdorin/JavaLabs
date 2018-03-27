package lab6;



import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ControlPanel extends JPanel{
	Canvas canvas;
	Image image;
	JButton saveButton=new JButton("Save");
	JButton loadButton=new JButton("Load");
	JButton resetButton=new JButton("Reset");
	ControlPanel(Canvas canvas){
		addFunctionality();
		init();
		this.canvas=canvas;
		
	}
	void addFunctionality() {
			
			loadButton.addActionListener(e->{
				try{
		            File image2 = new File("C:\\Users\\haloc\\OneDrive\\Protected\\Java\\An 2 FII\\JavaLabs\\Lab6\\1.jpg");
		            image = ImageIO.read(image2);

		        }
		        catch (IOException ee){
		            ee.printStackTrace();
		        }
				canvas.image=this.image;
				
			});
//			saveButton.addActionListener(e->{
//				try {
//					ImageIO.write(image, "jpg", new File("canvas.jpg"));
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//			});
//			resetButton.addActionListener(e->image=new BufferedImage(100, 200, BufferedImage.TYPE_INT_ARGB));
	}
	void init() {
		this.add(saveButton);
		this.add(loadButton);
		this.add(resetButton);

	}
}
