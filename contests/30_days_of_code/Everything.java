import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            boolean funny = true;
            for(int j = 0; j < s.length() / 2; j++){
                int diff1 = Math.abs(s.charAt(j+1) - s.charAt(j));
                int diff2 = Math.abs(s.charAt(s.length() - j - 1) - s.charAt(s.length() - j - 2)); 
                if(diff1 != diff2){
                    funny = false;
                    break;
                }
            }
            System.out.println(funny ? "Funny" : "Not Funny");
        }
    }
}