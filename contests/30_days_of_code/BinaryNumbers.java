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
            int j = sc.nextInt();
            StringBuilder s = new StringBuilder();
            while(j != 0){
                s.append(j%2);
                j = j / 2;
            }
            System.out.println(s.reverse());
        }
    }
}
