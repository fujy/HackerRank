import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String C = in.next();
        int count = 0;
        char temp = ' ';
        for (int i = 0; i < N; i++){
            char c = C.charAt(i);        
            if(c != temp){
                count++;
                temp = c;
            }
        }
        System.out.println(count);
    }
}
