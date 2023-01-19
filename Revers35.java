import java.util.Scanner;
  
public class Revers35{
    public static void main (String[] args) {
        
        String str= "Rahultota", nstr="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println("Rahultota"); 
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
    }
}