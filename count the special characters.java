import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int u=0;
        for(int i=0;i<str.length();i++)
        {
            if(!Character.isLetterOrDigit(str.charAt(i)))
            {
                u++;
            }
        }
        System.out.println(u);
    }
}
