import java.util.Scanner;

public class PowerCal{
    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

    System.out.println("Enter your base");
    double base = sc.nextDouble();
    System.out.println("Enter your exponent");
    double exp = sc.nextDouble();

      double result = Math.pow(base, exp);

     System.out.println("the value is: " + result);




}
}