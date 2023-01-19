import java.util.*;
public class ANagram18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name");
        String s1=sc.nextLine();
        System.out.println("Enter the second name ");
        String s2=sc.nextLine();
        if(s1.length()==s2.length()){
            char[] a1=s1.toCharArray();
            char[]a2=s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            boolean result=Arrays.equals(a1,a2);
            if(result){
                System.out.print("Anagram");
            }else{
                System.out.print("not Anagram");
            }
        }else{
            System.out.print("not Anagram");
        }
    }
    
}
