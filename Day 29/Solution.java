import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   public static void main(String args[]){
       Scanner sc =new Scanner(System.in);

      int t=sc.nextInt();

       while(t-- >0){
        int n=sc.nextInt();

        int k=sc.nextInt();
        int max=0;

        for(int i=1;i<n;i++){
           for(int j=i+1;j<=n;j++){
               if((max < (i & j)) && ((i&j)<k)){
                 max=(i&j);
               }
           }
        }
        System.out.println(max);
       }

       
   }

    
}
