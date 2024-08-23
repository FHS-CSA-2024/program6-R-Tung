import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {

    final double pi = 3.14159;
    
    Scanner userRadius = new Scanner(System.in);
    System.out.println("Enter radius: ");
  
    double radius = userRadius.nextDouble();
    double diameter = radius * 2;
    double area = pi * radius * radius;
    double circumference = 2 * pi * radius;
    
    System.out.printf("Radius is: " + "%,.3f %n", + radius);
    System.out.printf("Radius is: " + "%,.3f %n", + diameter);
    System.out.printf("Radius is: " + "%,.3f %n", + area);
    System.out.printf("Radius is: " + "%,.3f %n", + circumference);



  }
  
}

/*
Enter radius: 
3.712
Radius is: 3.712 
Radius is: 7.424 
Radius is: 43.288 
Radius is: 23.323 

*/
