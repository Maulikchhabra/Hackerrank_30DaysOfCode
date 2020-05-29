//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> m = new HashMap<String, Integer>(n);
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            m.put(name, phone);
            
        }

        //System.out.println(m);
        
        while(in.hasNext()){
            String s = in.next();
            if(m.containsKey(s)){
                System.out.println(s+"="+m.get(s));
            }
            else{System.out.println("Not found");}
            //System.out.println()
        }
        in.close();
        
    }
}
