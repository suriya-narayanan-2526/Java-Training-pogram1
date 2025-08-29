import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
                 Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int sum=0;
         int arr[] = new int[size];
         for(int i=0 ;i<size ; i++)
         {
             arr[i]=sc.nextInt();
         }
         for(int i=0;i<size ;i++)
         {
             if(i==0)
                 System.out.print(arr[0]*arr[i+1]+" ");
             else if(i==size-1)
                 System.out.print(arr[i-1]*arr[i]);
             else 
               System.out.print(arr[i-1]*arr[i+1]+" ");
                                  
         }
     }
}
