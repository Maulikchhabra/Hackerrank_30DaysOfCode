import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt();

            sc.nextLine();
        while(t-- >0){
           
            String complete = sc.nextLine();
            String even="",odd="";
            for(int i=0;i<complete.length();i++){
                if(i%2==0){
                    even=even+complete.charAt(i);
                }
                else{ odd=odd+complete.charAt(i);}
            }
            System.out.println(even+" "+odd);
        }
        
    }
}
