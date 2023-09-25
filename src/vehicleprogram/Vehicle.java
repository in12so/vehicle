
package vehicleprogram;

/**
 *
 * @author IN12SO
 */
public class Vehicle {
    //Instance variables
    String type;
    String model;
    float economy;
    int distance = 0;
    
    //constructor
    
    
    
    //Methods
    public void drive(){
        
        distance = distance + 1;
        System.out.println("Drive 1 km");
    }
    
    public void displayDetails(){
        
        System.out.println("The vehicle is a "+model);
        System.out.println("The make is "+type);
        System.out.println("The fuel economy is "+economy+ " mpg");
        System.out.println("The total distance travelled is "+distance);
        System.out.println("========================================");
        
    }
    

        
    
}
