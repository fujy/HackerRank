import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
   static  int find_gcd(int a,int b){
          //Write the base condition
          return find_gcd(b,a%b);
      }
}
 

