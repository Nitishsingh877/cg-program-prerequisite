import java.util.*;

public class Perimeter{

public static double Perimeter(double l, double b){
      double perimeter = 2*(l+b);
      return perimeter;
        
}
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your length");
    double l = sc.nextDouble();
    System.out.println("enter your breadth");
    double b = sc.nextDouble();
    
        
    System.out.println("The perimeter of rectangle is "+ Perimeter(l,b)); 
    
      
}
}