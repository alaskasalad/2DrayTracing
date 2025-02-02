package src.geometry;

import src.utility.point3D;
import src.utility.normal;

public class plane extends geometricObj
{
    // plane = point on the plane & normal vector (orthonogal to plane)
    // (p - p1) dot n = 0
    point3D Point; 
    normal Normal; 

    public plane(point3D Point, normal Normal, color Color)
    {
        this.Point = new point3D(Point); 
        this.Normal = new normal(Normal);
        this.Color = new color(Color); 
    }

    public double hit(ray Ray)
    {
        
    }
}
