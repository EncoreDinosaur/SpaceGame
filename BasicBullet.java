import java.awt.Graphics;

public class BasicBullet extends Bullet
{
    private int x, y;

    public BasicBullet(int x, int y)
    {
        super(10, 1);
        
        this.x = x;
        this.y = y;
    }
    
    public void paintComponent(Graphics g)
    {
        g.drawOval(10, 10, 10, 5);
    }
    
    public void move()
    {
        y += getSpeed();
    }
}