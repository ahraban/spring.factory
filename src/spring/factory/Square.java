package spring.factory;

/**
 *
 * @author Adam
 */
public class Square  implements Shape
{
    Point pointA;
    Point pointB;
    Point pointC;
    Point pointD;

    @Override
    public void draw() 
    {
        System.out.println("Triangel succesfully drawn");
        System.out.println("Point A: (" + this.pointA.getX() + ", " + this.pointA.getY()+ ")");
        System.out.println("Point B: (" + this.pointB.getX() + ", " + this.pointB.getY()+ ")");
        System.out.println("Point C: (" + this.pointC.getX() + ", " + this.pointC.getY()+ ")");
        System.out.println("Point D: (" + this.pointD.getX() + ", " + this.pointD.getY()+ ")");
    }
    
    
    // getters + seters
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

    public Point getPointC() 
    {
        return pointC;
    }

    public void setPointC(Point pointC) 
    {
        this.pointC = pointC;
    }

    public Point getPointD() 
    {
        return pointD;
    }

    public void setPointD(Point pointD) 
    {
        this.pointD = pointD;
    }
    
}
