import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        Long number = sc.nextLong();
        int count =0;
        while(number>0)
        {
          number = number/10;
            count++;
        }
        System.out.println(count);
        
    }
}
