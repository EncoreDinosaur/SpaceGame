import java.awt.Graphics;

public abstract class Bullet
{
    private int speed, damage;
    
    public Bullet(int speed, int damage)
    {
        this.speed = speed;
        this.damage = damage;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public abstract void move();
    public abstract void paintComponent(Graphics g);
}