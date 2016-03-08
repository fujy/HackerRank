import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int minimumDifference = Integer.MAX_VALUE;
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        
        for (int i = 0; i < n - 2; i++){
            int temp = Math.abs(a[i] - a[i+1]);
            if(temp < minimumDifference){
                list.clear();
                list.add(a[i]);
                list.add(a[i+1]);
                minimumDifference = temp;
            } else if(temp == minimumDifference) {
                list.add(a[i]);
                list.add(a[i+1]);
            }
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(list.get(i)+" ");
        }
    }
}