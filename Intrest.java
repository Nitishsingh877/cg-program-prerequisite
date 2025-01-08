import java.util.*;

public class Intrest{

public static double Simpleint(double p, double r, double t){
      double SI = (p*r*t)/100;
      return SI;
        
}
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your Principal");
    double p = sc.nextDouble();
    System.out.println("enter your rate");
    double r = sc.nextDouble();
    System.out.println("enter your time");
    double t = sc.nextDouble();
        
    System.out.println("The Simple Intrest is "+ Simpleint(p,r,t)); 
    
      
}
}