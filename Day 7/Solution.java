import java.util.Scanner;

class Solution{

    void reverse(int array[]){
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 

        Solution s = new Solution();
        s.reverse(arr);

    }

}
