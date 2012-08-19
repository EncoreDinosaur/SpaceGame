import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import javax.swing.*;
public class Game extends JPanel implements Runnable{
    ImageIcon background;
    Player player1;
    Map map;
    private Thread thread;
    private boolean playing=true;
    public Game(int width, int height){
        setPreferredSize(new Dimension(width, height));
        setVisible(true);
        player1 = new Player(300,300);
        map = new Map("Background.gif");
        thread = new Thread(this);
        thread.start();
        this.repaint();
    }
    
        public void run(){
            while(playing=true)
            {
                            try
            {
                Thread.sleep(10);
            }
            catch( InterruptedException e){}
                map.scrollMap();
                this.repaint();
                
            }
    }//insert game functions into this method
	public void paintComponent( Graphics g )
	{
	    super.paintComponent(g);
	    map.draw(g);
	   }//call the paint/draw methods of every object in this method
}