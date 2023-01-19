import java.util.Scanner;
import java.util.concurrent.*;
public class GCDnumber12 {
    public static void main(String[] args) {
        int GCD;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the First number : ");
         int num1=sc.nextInt();
         System.out.print("Enter the Secound number : ");
         int num2=sc.nextInt();
         for(int i=1;i<=num1&&i<=num2;i++){
            if(num1%i==0&&num2%i==0){
                GCD=i;
            System.out.print(GCD+" ");
            }
       }   }   
}
