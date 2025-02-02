package src.utility;

public class normal 
{
    // unit vector orthogonal to a surface 
    public double x, y, z; 

    public normal()
    {
        x = 0.0; 
        y = 0.0; 
        z = 0.0; 
    }

    public normal(double x, double y, double z)
    {
        this.x = x; 
        this.y = y; 
        this.z = z; 
    }

    public normal(normal Normal)
    {
        x = Normal.x; 
        y = Normal.y; 
        z = Normal.z; 
    }

    public double dot(normal Normal)
    {
        return x*Normal.x + y*Normal.y + z*Normal.z; 
    }

    public void normalize()
    {
        double magnitude = Math.sqrt(x*x + y*y + z*z); 
        x /= magnitude; 
        y /= magnitude; 
        z /= magnitude; 
    }
}
