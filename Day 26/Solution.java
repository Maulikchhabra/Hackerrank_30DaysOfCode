import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int ddR=sc.nextInt();
        int mmR=sc.nextInt();
        int yyyyR=sc.nextInt(); //R means returned

        int ddE=sc.nextInt();
        int mmE=sc.nextInt();
        int yyyyE=sc.nextInt(); //E means expected to return

        int fine=0;

        if(yyyyR==yyyyE){
           if(mmR==mmE){
               if(ddR<=ddE){
                   fine=0;
               }
               else{fine=15*(ddR-ddE);}
           }
           else if(mmR>mmE){
              fine=500*(mmR-mmE);
           }
        }
        else if(yyyyR>yyyyE){fine=10000;}

        System.out.println(fine);
    }
}
