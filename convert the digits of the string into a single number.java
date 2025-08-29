import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        {
            String str = sc.nextLine();
            String replace = str.replaceAll("[a-zA-Z]","");
            for(int i=0 ;i<str.length();i++)
            {
                char c = str.charAt(i);
                if(c>=48 && c<=57)
                    System.out.print(c);
            }
            if(replace.length()==0)
                System.out.println(0);
        }
    }
}
