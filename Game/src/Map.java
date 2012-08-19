import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Map extends JPanel implements Runnable{
	ImageIcon background;
	public Map(int width, int height){
		setPreferredSize(new Dimension(width, height));
		setVisible(true);
		
		background = makeBackground("Background.png");
		this.repaint();
	}
	
	public void paintComponent(Graphics g){
		background.paintIcon(this, g, 0, 2000);
		
	}
	
	private ImageIcon makeBackground(String file){
		return new ImageIcon(file);
	}
	private void backgroundScroll(){
		while(){
			
		}
	}
	public void run(){
		
	}
}
