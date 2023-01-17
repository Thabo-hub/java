package main.java;
import org.junit.Test;

import java.util.*;

public class User {
    public String name;
    public String email;
    protected String password;
    public User(String userName, String userEmail, String userPassword){
        this.name = userName;
        this.email = userEmail;
        this.password = userPassword;
    }


    public boolean login() {
        String[][] users = {
                {"Thabo", "thabo.gumede@gada.io"}
        };

        if (this.name == users[0][0] && this.email == users[0][1]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**LOGIN BELLOW**");
        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your E-mail:");
        String email = input.nextLine();

        System.out.println("Enter your password:");
        String pass = input.nextLine();

        User person = new User(name,email,pass);
        boolean results = person.login();

        //System.out.println(results);
        if(results == false){
            System.out.println("Access Deniad!");
        }else if(results == true){
            System.out.println("Welcome "+name);
            System.out.println("Enter your subject bellow:");
            String subject = input.nextLine();

            System.out.println("Enter your marks for the subject:");
            int myMarks = input.nextInt();

            Grades personGrades = new Grades();
            personGrades.checkMarks(subject,myMarks);
        }

    }
}