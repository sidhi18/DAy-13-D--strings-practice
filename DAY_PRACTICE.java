import com.sun.tools.javac.Main;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class DAY_PRACTICE {
    public static void main(String[] args) {
       //  1. FIRST PROGRAM ( FULL NAME )
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your FullName : "); // taking full name from user
        String fullname = sc.nextLine();
        // using spilt operator
        String split[] = fullname.split((" "));
        String firstname = split[0];
        String lastname = split[2];
        System.out.println("Firstname : " + firstname);
        System.out.println("lastname : " +lastname);
        System.out.println(fullname.length());  // extracting length
        // by concatening
        System.out.print("Enter your first name : "); // taking firstname from user
        String userfirst = sc.nextLine();
        System.out.print("Enter last name : ");  // taking lastname from user
        String userlast = sc.nextLine();
        System.out.println(userfirst+ " "+userlast);  // printing fullname by using '+' operator
        System.out.println("FullName : "+userfirst.concat(" ").concat(userlast)); // printing full name by using concat string method
        System.out.println("length : "+(userfirst+" "+lastname).length());  // extracting length

       //  2. SECOND PROGRAM (spilt method)
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Write few lines about your favourite thing : ");
        String toy = sc1.nextLine();
        int a = sc1.nextInt();  // taking index of things to extract from user any two things
        int b = sc1.nextInt();
        int c = sc1.nextInt();
        int d = sc1.nextInt(); // taking limit
        System.out.println("Type : "+toy.split(" ")[a]);
        System.out.println("Name : "+toy.split(" ")[b]);
        System.out.println("Color : "+toy.split(" " )[c]);
        System.out.println("Name : "+toy.split(" ",d )[b]); // prints the starting to sc1.length char sequence

        // 3.THIRD PROGRAM ( valueof method )
        Scanner sc2 = new Scanner(System.in);
        System.out.print(" Enter your name : ");
        String name1 = sc2.nextLine();
        System.out.print(" Enter your age : ");
        int age = sc2.nextInt();
        String valueof = String.valueOf(age);
        System.out.println("My name is "+name1.concat(" and my age is ").concat(valueof));

        //4.Fourth program ( isempty and isblank method )
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter string :  ");
        String str = sc3.nextLine();
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        if (str.isEmpty()==true){
            System.out.println("String is empty.");
        } else if (str.isBlank()==true){
            System.out.println("String must contain character . It should not be blank");
        } else {
            System.out.println("verified");
        }

        // 5. FIFTH PROGRAM (Format  method )
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name2 = sc4.nextLine();
        System.out.print("Enter age : ");
        int age1 = sc4.nextInt();
        System.out.print("Enter BloodGroup : ");
        String bloodgroup = sc4.next();
        System.out.print("Enter college name : ");
        String college = sc4.next();
        System.out.print(" Enter roll number : ");
        int rollnumber = sc4.nextInt();
        System.out.println(String.format("Name = %s \n Age = %d \n BLOODGROUP = %s+VE \n COLLEGE NAME = %s \n ROLL NUMBER = %d ",name2,age1,bloodgroup,college,rollnumber));












    }
}
