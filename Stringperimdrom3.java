import java.util.*;
public class Stringperimdrom3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String str=sc.nextLine();
        String revers=" ";
         for(int i =str.length()-1;i>=0;i--){
            revers=revers+str.charAt(i);
         }if(str.equals(revers)){
            System.out.print("perimdrome String : ");
         }else{
            System.out.print("Not peridrom String : ");
         }
    }
}
