import java.awt.Graphics;

public abstract class Sprite
{
    private int health, x, y;
    private Bullet bullet;

    public Sprite(int health, int x, int y)
    {
        this.health = health;
        this.x = x;
        this.y = y;
    }
    
    public abstract void paintComponent(Graphics g);
    
    public abstract void move();
    
    public void changeHealth(int hpChange)
    {
        health -= hpChange;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void shiftX(int horizontal)
    {
        x -= horizontal;
    }
    
    public void shiftY(int vertical)
    {
        y -= vertical;
    }
}