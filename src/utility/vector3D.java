package src.utility;

public class vector3D 
{
    public double x, y, z;
    
    public vector3D()
    {
        x = 0.0; 
        y = 0.0; 
        z = 0.0; 
    }

    public vector3D(double x, double y, double z)
    {
        this.x = x; 
        this.y = y; 
        this.z = z; 
    }

    public vector3D(vector3D vector)
    {
        x = vector.x; 
        y = vector.y; 
        z = vector.z; 
    }

    public vector3D add(vector3D vector)
    {
        return new vector3D(x+vector.x, y+vector.y, z+vector.z); 
    }

    public vector3D sub(vector3D vector)
    {
        return new vector3D(x-vector.x, y-vector.y, z-vector.z); 
    }

    
    public double dot(vector3D vector)
    {
        return x*vector.x + y*vector.y + z*vector.z; 
    }

    public double dot(point3D point)
    {
        return x*point.x + y*point.y + z*point.z; 
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
