import java.util.*;
public class reversString8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the name : ");
        String str=sc.nextLine();
        String str1 =" ";
        int l=str.length();
        for(int i=l-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.print(str1);
        
    }
}
