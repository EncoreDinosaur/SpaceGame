import java.awt.Graphics;

public class Noob extends Enemy
{
    public Noob()
    {
        super(10, 0, (int)Math.random()*800);
    }
    
    public void paintComponent(Graphics g)
    {
        g.fillRect(getX(), getY(), 40, 40);
    }
    
    public void move()
    {
        shiftY(-10);
    }
}