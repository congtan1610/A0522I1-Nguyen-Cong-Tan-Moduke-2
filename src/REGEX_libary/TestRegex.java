package REGEX_libary;

import java.util.Scanner;

public class TestRegex {
   private static Regex regex=new Regex();
    private static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
       String email;
       do {
            System.out.println("Enter your email:");
             email=input.nextLine();
       }while (!(email.matches(regex.REGEX_EMAIL)));
        System.out.println(email);
    }
}
