import java.util.*;

public class Average{

public static double Average(int a, int b,int c){
      int av = (a+b+c)/3;
      return av;
        
}
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your first  number");
    int a = sc.nextInt();
 System.out.println("enter your Second  number");
    int b = sc.nextInt();
 System.out.println("enter your third  number");
    int c = sc.nextInt();
   
     
    System.out.println("The Average of three numbers is: "+ Average(a,b,c)); 
    
      
}
}