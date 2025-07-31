import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit =0;
        int m =1;
        while(number>0)
        {
          digit = number%10;
          m=m*digit;
          number=number/10;
          
        }
        System.out.print(m);
    }
}
