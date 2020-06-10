import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        bubble(a);
    }

    static void bubble(int arr[]){
       int swapCount=0;
       int n=arr.length;
       for(int i=0;i<n-1;i++){
         for(int j=0; j<n-i-1; j++){
           if(arr[j+1]<arr[j]){
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
               swapCount++;
           }
       }}
       
       System.out.println("Array is sorted in " +swapCount+ " swaps.");
       System.out.println("First Element: "+arr[0]);
       System.out.println("Last Element: "+arr[n-1]);
    }
}
