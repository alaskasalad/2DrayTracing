package src.utility;

public class ray 
{
    public point3D origin; 
    public vector3D direction; 
    
    public ray(point3D origin, vector3D direction)
    {
        this.origin = new point3D(origin); 
        this.direction = new vector3D(direction); 
    }
}
