import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        char c =sc.next().charAt(0);
        sc.nextLine();
        String str = sc.nextLine();
        for(int i=0 ;i<str.length();i++)
        {
            if(str.charAt(i) == c)
            {
                System.out.println("Present");
                return;
            }
           
        }
        
        
            
                System.out.println("Not Present");
            
        
    }
}
