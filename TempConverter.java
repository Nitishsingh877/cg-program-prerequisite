import java.util.*;

public class TempConverter{

public static double convert(double c){
        double F = (c*9/5)+32;
        return F;
}
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter temprature in celsius");
     double c = sc.nextDouble();

    System.out.println("The Fahrenheit for " + c + " is: " + convert(c));
      
}
}