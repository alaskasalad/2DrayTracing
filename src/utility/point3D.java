package src.utility;

public class point3D 
{
    public double x, y, z;  

    public void Point3D()
    {
        x = 0.0; 
        y = 0.0;
        z = 0.0; 
    }

    public point3D(point3D point)
    {
        x = point.x; 
        y = point.y; 
        z = point.z; 
    }

    public point3D(double x, double y, double z)
    {
        this.x = x; 
        this.y = y; 
        this.z = z; 
    }

    public point3D add(point3D point)
    {
        return new point3D(x+point.x, y+point.y, z+point.z); 
    }

    public point3D sub(point3D point)
    {
        return new point3D(x-point.x, y-point.y, z-point.z); 
    }

    public double dot(point3D point)
    {
        return x*point.x + y*point.y + z*point.z; 
    }

    public double dot(vector3D vector)
    {
        return x*vector.x + y*vector.y + z*vector.z; 
    }

    public double dot(normal Normal)
    {
        return x*Normal.x + y*Normal.y + z*Normal.z; 
    }
    
}
