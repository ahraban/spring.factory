
package spring.factory;

/**
 *
 * @author Adam
 */
public class Circle implements Shape
{
    //circle center point
    Point pointA;

    @Override
    public void draw() 
    {
        System.out.println("Circle succesfully drawn");
        System.out.println("Center point: (" + this.pointA.getX() + ", " + this.pointA.getY()+ ")");
        
    }
    
    
    // getters + setters
    public Point getPointA() 
    {
        return pointA;
    }

    public void setPointA(Point pointA) 
    {
        this.pointA = pointA;
    }
    
    
}
