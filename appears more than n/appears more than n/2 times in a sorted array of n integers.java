import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int data=0;
        int size = sc.nextInt();
        int sum=0;
        int arr[] = new int[size];
        int count=1,max=0;
        for(int i=0 ;i<size ; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0 ;i<size-1 ;i++)
        {
            if(arr[i]==arr[i+1])
                count++;
            else
            {
                if(max<count)
                {
                    max=count;
                    data =arr[i];
                }
                count=1;
            }
        }
        if(max>size/2)
            System.out.println("The majority element is : "+data);
        else
            System.out.println("No majority element found in the array");
    }
}
