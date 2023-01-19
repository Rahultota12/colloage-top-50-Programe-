import java.util.*;
public class BinarySerch17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter Array size :");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the value : ");
        for
        (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the surching Array :");
         int num=sc.nextInt();
         int lower=0;
         int high=n-1;
         int mid=0;
         while(lower<=high){
            mid=(lower+high)/2;
            if(arr[mid]==num){
                System.out.print("Find the value " + mid);
                break;
            }else if(arr[mid]>num){
                high=mid-1;
            }else if(arr[mid]<num){
                lower=mid+1;
            }
         }
         if(lower>high){
            System.out.print("not found value");
         }
    }
    
}
