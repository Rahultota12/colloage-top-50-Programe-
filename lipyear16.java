import java.util.*;
public class lipyear16 {
    public static void main(String[] args) {
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the year : ");
        year=sc.nextInt();
        if(year%400==0||(year%4==0&&year%100!=0)){
            System.out.print("leapyear");
        }  else{
            System.out.print("not leapyear");
        }  
    }
}
