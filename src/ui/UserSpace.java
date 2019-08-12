package ui;

import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class UserSpace 
{
    //available shapes to be drawn
    String[] selection =  {"Circle, ","Line, ","Triangel, ","Square"};
        
    
    //user interface constructor - offers available shapes to user
    UserSpace()
    {
        System.out.print("Please select one of following shapes to find its coordinates: ");
        this.listShapes();
    }
    
    
    // method to list all available shapes - used in constructor
    public void listShapes ()
    {
        for(int i=0; i<=selection.length-1;i++)
        {
            System.out.print((selection[i]));
        }
        System.out.println();
    }
    
    
    //method to scan user input + return selected shape  
    public String selectShape()
    {
        Scanner sc = new Scanner(System.in);
        String userShape = sc.nextLine();
        switch (userShape)
        {
            case "Circle":
                    return "circle";                    
            case "Line":
                        return "line";
            case "Triangel":
                        return "triangel";
            case "Square":
                        return "square";
            default:
                System.out.println("Next time select your shape more wisely. Thank you for playing :)");
                return "Input Error";
        }
    }
}
