
//  Vending Machine

import java.rmi.Remote;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

import javax.sound.sampled.SourceDataLine;
 
public class vending19 {
    public static void main(String[] args) {

        System.out.println("----product list -----");
        System.out.println(
                " 01 - Walkers Chips\t : 25 INR \n 02 - Bread pasty\t : 40 INR \n 03 - chocolate          : 180 INR \n 04 - Cream roll\t : 10 INR ");

        int walkesr = 25, pasty = 40, chocolate = 180, Creamroll = 10;
        int money, remain = 0, code;
        int press, count = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nPlease Insert Money : ");
            money = sc.nextInt();

            // --------------------------------------------------------------------------------------------------------------------

            if (money >= 10 && money <= 500) {

                if (money >= chocolate && money <= 500) {
                    System.out.println("\nAvalbile Option\n");
                    System.out.println(
                            " 1 - Walkers Chips\t : 25 INR \n 2 - Bread pasty\t : 40 INR \n 3 - chocolate           : 180 INR \n 4 - Cream roll\t         : 10 INR ");
                    System.out.println("Enter Your Choice-------");
                    code = sc.nextInt();
                    if (code == 1) {

                        System.out.println("How much lay you want");
                        count = sc.nextInt();
                        walkesr = walkesr * count;
                        remain = money - walkesr;

                        if (money >= walkesr) {
                            System.out.println(" Please Collect " + count + " Walkesr chips From Trolley\n");
                            System.out.println(" Remain Amount : " + remain);

                        } else {
                            System.out.println("You Hava No Money");
                        }

                    } else if (code == 2) {
                        System.out.println("How mach lay you want ");
                        count = sc.nextInt();
                        pasty = pasty * count;
                        remain = money - pasty;
                        if (money >= pasty) {

                            System.out.println("please Collect " + count + " Pasty From Trokkey\n");
                            System.out.println(" Remain Amount : " + remain);

                        } else {
                            System.out.println("You Hava No Money");
                        }

                    } else if (code == 3) {
                        System.out.println("How mach lay you want ");
                        count = sc.nextInt();

                        chocolate = chocolate * count;
                        remain = money - chocolate;
                        if (money >= chocolate) {

                            System.out.println("please Collect " + count + " Chocolate From Trokkey\n");

                            System.out.println(" Remain Amount : " + remain);

                        } else {
                            System.out.println("You Hava No Money");
                        }

                    } else if (code == 4) {
                        System.out.println("How mach lay you want");
                        count = sc.nextInt();
                        Creamroll = Creamroll * count;
                        remain = money - Creamroll;
                        if (money >= Creamroll) {

                            System.out.println("please Collect " + count + " Creamroll From Trokkey\n");
                            System.out.println(" Remain Amount : " + remain);

                        } else {
                            System.out.println("You Hava No Money");
                        }
                    }
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------------------");

                } else if (money >= pasty && money <= 500) {
                    System.out.println("\nAvalbile Option\n");
                    System.out.println(
                            " 1 - Walkers Chips\t : 25 INR \n 2 - Bread pasty\t : 40 INR \n 3 - Cream roll\t         : 10 INR ");

                    System.out.println("Enter Your Choice-----");
                    code = sc.nextInt();

                    if (code == 1) {
                        System.out.println("How mach lay you want");
                        count = sc.nextInt();

                        walkesr = walkesr * count;
                        remain = money - walkesr;
                        if (money >= walkesr) {
                            System.out.println(" Please Collect " + count + " Walkesr chips From Trolley\n");
                            System.out.println(" Remain Amount : " + remain);

                        } else {
                            System.out.println("You Hava No Money");
                        }

                    } else if (code == 2) {
                        System.out.println("How mach lay you want");
                        count = sc.nextInt();

                        pasty = pasty * count;
                        remain = money - pasty;
                        if (money >= pasty) {

                            System.out.println("please Collect " + count + " Pasty From Trokkey\n");
                            System.out.println(" Remain Amount : " + remain);

                        } else {
                            System.out.println("You Hava No Money");
                        }

                    } else if (code == 3) {
                        System.out.println("How mach lay you want");
                        count = sc.nextInt();
                        Creamroll = Creamroll * count;
                        remain = money - Creamroll;
                        if (money >= Creamroll) {

                            System.out.println("please Collect " + count + " Creamroll From Trokkey\n");
                            System.out.println(" Remain Amount : " + remain);

                        } else {
                            System.out.println("You Hava No Money");
                        }
                    }
                    System.out.println(
                            "-------------------------------------------------------------------------------------------------------");
                } else if (money >= walkesr && money <= 500) {
                    System.out.println("\nAvalbile Option\n");
                    System.out.println(" 1 - Walkers Chips\t : 25 INR \n 2 - Cream roll\t         : 10 INR ");

                    code = sc.nextInt();

                    if (code == 1) {
                        System.out.println("How mach lay you want");
                        count = sc.nextInt();

                        walkesr = walkesr * count;
                        remain = money - walkesr;
                        if (money >= walkesr) {

                            System.out.println("please Collect " + count + " Walkesr From Trokkey\n");
                            System.out.println(" Remain Amount : " + remain);

                        } else {
                            System.out.println("You Hava No Money");
                        }

                    } else if (code == 2) {
                        System.out.println("How mach lay you want");
                        count = sc.nextInt();

                        Creamroll = Creamroll * count;
                        remain = money - Creamroll;
                        if (money >= Creamroll) {

                            System.out.println("please Collect " + count + " Creamroll From Trokkey\n");
                            System.out.println(" Remain Amount : " + remain);

                        } else {
                            System.out.println("You Hava No Money");
                        }
                    }
                    System.out.println(
                            "--------------------------------------------------------------------------------------------------");

                } else if (money >= Creamroll && money <= 500) {
                    System.out.println("\nAvalbile Option\n");
                    System.out.println("1 - Cream roll\t : 10 INR ");
                    code = sc.nextInt();

                    System.out.println("Enter Your Choice-----");
                    if (code == 1) {
                        System.out.println("How mach lay you want");
                        count = sc.nextInt();

                        Creamroll = Creamroll * count;
                        remain = money - Creamroll;
                        if (money >= Creamroll) {

                            System.out.println("please Collect " + count + " Creamroll From Trokkey\n");
                            System.out.println(" Remain Amount : " + remain);

                        } else {
                            System.out.println("You Hava No Money");
                        }
                    }
                }

            } else {
                System.out.println("--Currency Not Supported--");
            }
            System.out.println("press 1 for continue  \t press 2 for exit");

            press = sc.nextInt();
        }

        while (press == 1);

        System.out.println("-----------------------------EXIT---------------------------");

    }

}