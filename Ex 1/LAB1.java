import java.util.Scanner;

public class LAB1 {
 public static void main(String[] args) {
    //Write a Java Program that will collect an employee's basic details that fall into different data types and displays them.
 Scanner a = new Scanner(System.in);

 System.out.print("Employee Name: ");
 String name = a.nextLine();

 System.out.print("Employee Age: ");
 int age = a.nextInt();

//After the details have been displayed, with the help of conditional statements, check if the gender of the employee is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'.

 System.out.print("Employee Gender [m/f]: ");
 char gender = a.next().charAt(0);

 System.out.print("Employee State: ");
 a.nextLine(); 
 String state = a.nextLine();
 System.out.print("Employee Company: ");
 String company = a.nextLine();
 System.out.println("\nEmployee Details:");
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 System.out.println("Gender: " + (gender == 'm' ? "MALE" :"FEMALE"));
 System.out.println("State: " + state);
 System.out.println("Company: " + company);
//Assume that you can divide the states among India into different regions (North, South, Central, East, and West). If the employee is from the southern part of India, with the help of a switch statement, it should display "The Employee is from the southern states of India; Preferable work location is in <state>",
 switch (state) {
   case "Maharashtra","Goa","Gujarat":
       System.out.println("The Employee is from the western part of India; Preferable work location is in"+state);
       break;
   case "Rajasthan","Haryana","Himachal Pradesh","Punjab","Chandigarh","Delhi","Jammu and Kashmir","Ladakh":
       System.out.println("The Employee is from the northern part of India; Preferable work location is in"+state);
       break;
   case "Kerala","Andhra Pradesh","Karnataka","Tamil Nadu","Telangana":
       System.out.println("The Employee is from the southern part of India; Preferable work location is in"+state);
       break;
   case "Odisha","Bihar","West Bengal","Jharkhand":
       System.out.println("The Employee is from the eastern part of India; Preferable work location is in"+state);
        break;
}
 }
 }
//Identify if the employee belongs to the top MNC Companies (Facebook, Google, Microsoft, Samsung, IBM, Apple); if so, print a message "The employee is working in Top MNC Companies".
 if (company.equals("Facebook") || company.equals("Google") ||
 company.equals("Microsoft") || company.equals("Samsung") ||
 company.equals("IBM") || company.equals("Apple")) {
 System.out.println("The employee is working in Top MNC Companies");
 }
 }
}