class singletonclass{
     static singletonclass sc=new singletonclass();
     private singletonclass(){
         System.out.println("singletonclass");
     }
     static singletonclass getinstance(){
           return sc;
     }
    }
public class tota{
public static void main(String[] args) {
   singletonclass sc1=singletonclass.getinstance(); 
   singletonclass sc2=singletonclass.getinstance();
   System.out.print(sc1+"   \n  "+sc2);  
   }
}