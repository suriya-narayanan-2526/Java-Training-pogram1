import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0 ;i<size ;i++)
        {
          if(arr[i]<min)
            {
                min = arr[i];
            }
        }
            System.out.println(min);
        
    }
}
