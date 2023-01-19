import java.util.Scanner;
public class Fobennciseric1 {
    public static void main(String[] args) {
        int term, a=0,b=1,c;
        Scanner r=new Scanner(System.in);
        System.out.print("enter term : ");
        term=r.nextInt();
        for(int i=0;i<term;i++){
            System.out.println(a+" ");
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }
}
