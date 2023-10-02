
package vehicleprogram;

/**
 *
 * @author IN12SO
 */
public class VehicleProgram {

    public static void main(String[] args) {
     
        Vehicle aCar = new Vehicle("Car","Renault", 55.00F,4,"John Doe",7);
        Vehicle aVan = new Vehicle("Van","Volkswagen", 65.00F,4,"Paul Smith",3);
        Vehicle aBike = new Vehicle("Bike","Ducati", 54.60F,2,"The Stig",5);
        
//        aCar.model = "Nissan";
//        aCar.type = "Qashqai";
//        aCar.economy = 55.40f;
//        
//        
//        aVan.model = "Volkswagen";
//        aVan.type = "Transporter";
//        aVan.economy = 40.00f;
        
 
     
        
        aCar.drive();
        aCar.drive();
        aCar.displayDetails();
        
        aBike.displayDetails();
        
        
        
    }
    
}
