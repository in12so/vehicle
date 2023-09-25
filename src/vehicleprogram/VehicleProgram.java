
package vehicleprogram;

/**
 *
 * @author IN12SO
 */
public class VehicleProgram {

    public static void main(String[] args) {
     
        Vehicle aCar = new Vehicle();
        Vehicle aVan = new Vehicle();
        
        aCar.model = "Nissan";
        aCar.type = "Qashqai";
        aCar.economy = 55.40f;
        
        
        aVan.model = "Volkswagen";
        aVan.type = "Transporter";
        aVan.economy = 40.00f;
        
//        System.out.println("The car is a "+aCar.model);
//        System.out.println("The make is "+aCar.type);
//        System.out.println("The fuel economy is "+aCar.economy+ " mpg");
//        
//        System.out.println("=======================================");
        

  
        
       
       
        aCar.drive();
        aCar.displayDetails();
        aCar.drive();
        aCar.drive();
        aCar.displayDetails();
        
        
        
    }
    
}
