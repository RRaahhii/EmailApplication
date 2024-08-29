import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        //this is going to run the Email object
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first name of employee:");
        String f1 = sc.next();
        System.out.print("Enter last name of employee:");
        String f2 = sc.next();
        System.out.println("Enter your personal email site (Ex. @gmail.com): \n");
        String f3 = sc.next();
        Email em1 = new Email(f1, f2);
        System.out.print("You're alternate email is: \n");
        em1.setAlternateEmail(f1 + f2 + f3);
        System.out.println(em1.getAlternateEmail());
        System.out.println("Overview for new employee: \n");
        System.out.println(em1.showInfo());
    }
}
