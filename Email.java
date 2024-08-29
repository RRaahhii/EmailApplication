import java.util.*;
import java.util.Scanner;

public class Email {
private String firstName, lastName, password, department, alternateEmail, email;
private String companyName = "Scammingcompany.com";
private int mailboxCapacity = 750;
private int defaultPasswordLength = 12;

//get the first and last name
public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  //System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

    // call a method asking for the department - return the department
    this.department = setDepartment();
    System.out.println("Department: " + this.department);

    // call a method that returns a random password
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your new generated password is: " + this.password);

    //combine elements to generate email
    email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." +  companyName;
    System.out.println("Your email is: " + email);
    }

    //ask for department
private String setDepartment() {
    System.out.print("Enter your department designation: \n1 for sales\n2 for development\n3 for accounting\n0 for null");
    Scanner sc = new Scanner(System.in);
    int depChoice = sc.nextInt();
    if (depChoice == 1)
        return "sales";
    else if (depChoice == 2)
        return "development";
    else if (depChoice == 3)
        return "accounting";
    else
        return "no-specified-department";
    }
    //generate random password
private String randomPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%+_=><^|";
    char[] password = new char[length];
    for (int i = 0; i < length; i++) {
       int randomValue = (int) (Math.random() * passwordSet.length());
       password[i] = passwordSet.charAt(randomValue);
    }
    return new String(password);
}

    //set the mailbox capacity
    public void setMailboxCapacity(int cap) {
    this.mailboxCapacity = cap;
    }
    // set an alternate email
    public void setAlternateEmail(String alt) {
    this.alternateEmail = alt;
    }
    //change the password
    public void changePassword(String password) {
    this.password = password;
    }
    public int getMailboxCapacity () {
    return mailboxCapacity;
    }
    public String getAlternateEmail() {
    return alternateEmail;
    }
    public String getPassword() {
    return password;
    }
   public String showInfo() {
    return "full name: " + firstName + " " + "|" + " " + lastName + " " + "|" + " " + "Company email: " + email + " " +  "|" + " " + "mailbox capacity: " + mailboxCapacity + "GB";
    }
}
