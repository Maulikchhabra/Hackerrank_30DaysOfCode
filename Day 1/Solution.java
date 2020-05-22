import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

       int sum;
       double add;
       //String con;

       int a =scan.nextInt();
       double b=scan.nextDouble();
       String c;
       scan.nextLine();
       c = scan.nextLine();

       sum = a+i; //adding int values
       add = b+d; //adding double values
      // con = s.concat(c); //concatenate strings

       System.out.println(sum);
       System.out.println(add);
       System.out.println(s.concat(c));
        
        scan.close();
    }
}
