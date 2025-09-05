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
        for(int r=1 ;r<=n;r++)
        {
            for(int s=1 ;s<=n-r;s++)
            {
                System.out.print(" ");

            }
            for(int st =1;st<=n;st++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
