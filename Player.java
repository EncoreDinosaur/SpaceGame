import java.awt.event.*;
import java.awt.Graphics;
public class Player extends Sprite
{
    public Player(int x, int y)
    {
        super(100, x, y);
        
        class Keys implements KeyListener
        {
            public void keyReleased(KeyEvent e)
            {
            }
            
            public void keyPressed(KeyEvent e)
            {
                switch (e.getKeyCode())
                {
                    case KeyEvent.VK_UP: shiftY(10);
                        break;
                    case KeyEvent.VK_DOWN: shiftY(-10);
                        break;
                    case KeyEvent.VK_LEFT: shiftX(10);
                        break;
                    case KeyEvent.VK_RIGHT: shiftX(-10);
                }
            }
            
            public void keyTyped(KeyEvent e)
            {}
        }
    }
    
    public void paintComponent(Graphics g)
    {
        g.fillOval(getX(), getY(), 100, 100);
    }
    public void move()
    {
    
    }
}