import java.util.*;

public class Area{

public static double Area(double r){
      double area = 22.0/7*r*r;
      return area;
        
}
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your Radius");
    double r = sc.nextDouble();
     
    System.out.println("The area of circle is: "+ Area(r)); 
    
      
}
}