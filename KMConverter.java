import java.util.*;

public class KMConverter{

public static double Miles(int km){
      double Miles = km * 0.621371;
      return Miles;
        
}
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter KiloMeters ");
    int km = sc.nextInt();

   
     
    System.out.println("The Miles for "+ km + " KM is " + Miles(km) + "miles"); 
    
      
}
}