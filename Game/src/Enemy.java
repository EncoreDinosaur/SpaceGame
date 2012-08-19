import java.awt.Graphics;

public abstract class Enemy extends Sprite
{
    public Enemy(int health, int x, int y)
    {
        super(health, x, y);
    }
    
    public abstract void move();
    public abstract void paintComponent(Graphics g);
}