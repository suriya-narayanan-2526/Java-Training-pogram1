import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int val;
        for(int r=1;r<=n;r++)
        {
            if(r%2!=0)
                 val=1;   
            else
                val=2;   
            for(int c=1;c<=r;c++)
            {
                System.out.print(val);
                val=val+2;
            }
            System.out.println();
        }
    }
}
