import java.util.*;

public class Adder{

public static int adder(int a, int b){
        return a+b;
}
  public static void main(String[] args) {
 
    Scanner Sc = new Scanner(System.in);
       System.out.println("enter your first number");
      int a = Sc.nextInt();
      System.out.println("enter your Second number");
      int b = Sc.nextInt();
       System.out.println("The sum is :" + adder(a,b)); 

}
}