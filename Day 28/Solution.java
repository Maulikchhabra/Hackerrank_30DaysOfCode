import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int n = sc.nextInt();

        sc.nextLine();

        String express="[a-z.]+@gmail\\.com";
        Pattern patt=Pattern.compile(express);

        String arr[]=new String[n];
        ArrayList<String> names = new ArrayList<String>();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
            String half[]=arr[i].split(" ");
            //names[i]=half[0];
            Matcher mat =patt.matcher(half[1]);
            if(mat.matches()){
                names.add(half[0]);
            }
        }
        
        Collections.sort(names);

        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
