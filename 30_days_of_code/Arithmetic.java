import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      // Enter your code here!
      // Run some computations....
      double tip = (T*M)/100;
      double tax = (X*M)/100;
      double final_price = M + tip + tax;
      int total = (int) Math.round(final_price);
      System.out.println("The final price of the meal is $"+total+".");
      
    }
}

