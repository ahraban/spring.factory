package spring.factory;

/**
 *
 * @author Adam
 */
public class Line implements Shape
{
    
    Point pointA;
    Point pointB;
    
    
    
    @Override
    public void draw() 
    {
        System.out.println("Line succesfully drawn");
        System.out.println("Point A: (" + this.pointA.getX() + ", " + this.pointA.getY()+ ")");
        System.out.println("Point B: (" + this.pointB.getX() + ", " + this.pointB.getY()+ ")");    
    }
    
    
    
    //gettters + setters
    public Point getPointA() 
    {
        return pointA;
    }

    public void setPointA(Point pointA) 
    {
        this.pointA = pointA;
    }

    public Point getPointB() 
    {
        return pointB;
    }

    public void setPointB(Point pointB) 
    {
        this.pointB = pointB;
    }
    

}
