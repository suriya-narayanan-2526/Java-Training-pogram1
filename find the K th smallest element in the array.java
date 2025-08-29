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
        int k =sc.nextInt();
        int arr[] = new int[size];
        for(int i=0 ;i<size ; i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(size<k)
        {
            System.out.println("Out of Range");
        }
        else
        {
            System.out.println(arr[k-1]);
        }
    }
}
