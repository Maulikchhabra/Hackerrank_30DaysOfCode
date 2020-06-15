import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        outer :while(n-- >0){
           int num=sc.nextInt();
           
            for(int i=2;i<=java.lang.Math.sqrt(num);i++){
                if(num%i==0){
                    System.out.println("Not prime");
                    continue outer;
                  }
              }
           
              if(num==1){
                System.out.println("Not prime");
                continue;
              }
           System.out.println("Prime");
        }
    }
}



