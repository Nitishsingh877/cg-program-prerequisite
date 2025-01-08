import java.util.*;

public class Volume{

public static double Volume(double r, double h){
      double volume = 22.0/7*r*r*h;
      return volume;
        
}
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your Radius");
    double r = sc.nextDouble();
    System.out.println("enter your height");
    double h = sc.nextDouble();
     
    System.out.println("The Volume of Cylinder is: "+ Volume(r,h)); 
    
      
}
}