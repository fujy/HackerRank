import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean isPrime(int x){
        if(x < 2)
            return false;
        
        int root = (int) Math.sqrt(x);
        for(int i = 2; i<=root; i++)
            if(x%i == 0)
                return false;
            
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            if(isPrime(sc.nextInt())){
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
