package src.utility;

public class color 
{
    public float r, g, b; 

    public color()
    {
        r = 0.0F;
        g = 0.0F;
        b = 0.0F; 
    }

    public color(float r, float g, float b)
    {
        this.r = r; 
        this.g = g; 
        this.b = b; 
    }

    public color(color Color)
    {
        r = Color.r; 
        g = Color.g; 
        b = Color.b; 
    }

    public void add(color Color)
    {
        r += Color.r; 
        g += Color.g; 
        b += Color.b; 
    }

    public void divide(int scalar)
    {
        r /= scalar; 
        g /= scalar; 
        b /= scalar; 
    }

    public int toInteger()
    {
        return (int) (r*225) << 16 | (int) (g*225) << 8 | (int) (b*225); 
    }
}
