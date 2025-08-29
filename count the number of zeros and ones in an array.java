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
        int z=0;
        int arr[] = new int[size];
        for(int i=0 ;i<size ; i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0)
                z++;
        }
        System.out.println("zc = "+z);
        System.out.println("oc = "+(size-z));
    }
}
