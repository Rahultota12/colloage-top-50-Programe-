import java.util.*;
public class reversbord15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentenc : ");
       String str=sc.nextLine();
        String str2=" ";
        String revers[]=str.split(str2);
        for(int i=revers.length-1; i>=0;i--){
            str2+=revers[i]+" ";
        }
        System.out.print("revers sentence :" +str2);
    }
}
