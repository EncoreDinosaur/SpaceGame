import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Map extends JPanel implements Runnable{
    ImageIcon background;
    int x=0, y=-1400;//-1400 because my math is awesome.
    public Map(String a){
        setVisible(true);
        background = makeBackground(a);
        this.repaint();
    }
    
    public void paintComponent(Graphics g){
        background.paintIcon(this, g, 0, 2000);
    }
    
    private ImageIcon makeBackground(String file){
        return new ImageIcon(file);
    }
    public void changeMap(String a)
    {
        makeBackground(a);
    }
    
    public void run(){
        
    }
        public void draw(Graphics g)
    {
        background.paintIcon(this,g,x,y);
    }
    public void scrollMap()
    {
       y++;
    }
    public void resetMap()
    {
        y=-1400;
    }
}
