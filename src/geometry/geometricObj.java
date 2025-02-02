package src.geometry;
import src.utility.ray;
import src.utility.color;

public abstract class geometricObj 
{
    // where our ray will intersect with obj if it does at all (0 if it doesnt)
    public abstract double hit(ray Ray); 

    // give a color when we create a obj 
    public color Color; 
}
