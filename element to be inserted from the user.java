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
        int arr[] = new int[size+1];
        for(int i=0 ;i<size ; i++)
        {
            arr[i]=sc.nextInt();
        }
        int data = sc.nextInt();
        int pos  = sc.nextInt();
        for(int i=size ;i>pos-1 ;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=data;
        for(int i=0 ;i<size+1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
