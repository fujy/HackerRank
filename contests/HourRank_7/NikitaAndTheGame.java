import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int sum(int A[], int start, int end){
        int sum = 0;
        for(int i = start; i < end; i++)
            sum += A[i];
        return sum;
    }
    
    public static int divide(int A[], int start, int end){
        boolean divisable = false;
        int count = 0;
        int pointer = start + 1;
        while (pointer < end){
            int suml = sum(A, start, pointer);
            int sumr = sum(A, pointer, end);
            if(suml == sumr){
                divisable = true;
                break;
            }
            pointer++;
        }
        if(divisable){
            int countLeft = 1+divide(A, start, pointer);
            int countRight = 1+divide(A, pointer++, end);
            return countLeft > countRight ? countLeft : countRight;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++){
            int n = in.nextInt();
            
            int A[] = new int[n];
            for (int j = 0; j < n; j++){
               A[j] = in.nextInt();
            }
            
            System.out.println(divide(A,0,n));
        }
    }
}

