package spring.factory;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ui.UserSpace;

/**
 *
 * @author Adam
 */
public class Main {


    public static void main(String[] args) 
    {   
        //instantiate spring bean factory
        AbstractApplicationContext context = new ClassPathXmlApplicationContext ("spring.xml");
        context.registerShutdownHook();
        
        //get user interface bean - read user inputs
        UserSpace userS = (UserSpace)context.getBean("ui");
        String input = userS.selectShape();
        
        //validate user inputs + draw a shape
        try 
        {
            Shape shape = (Shape) context.getBean(input);
            shape.draw();
        } 
        catch (Exception e)
        {
            System.out.println("Exception: Shape not found in Spring Bean Factory");
        }
    }
    
}
