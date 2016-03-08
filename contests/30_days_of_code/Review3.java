import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ![,?.\\_'@+]");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
        }
    }
}
