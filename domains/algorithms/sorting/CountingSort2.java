import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int count = map.containsKey(num) ? map.get(num) + 1 : 1;
            map.put(num, count);
        }
        for (Integer k : map.keySet()) {
            int count = map.get(k);
            for (int i = 0; i < count; i++)
                System.out.print(k + " ");
        }
    }
}