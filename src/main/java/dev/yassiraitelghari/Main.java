package dev.yassiraitelghari;

import dev.yassiraitelghari.domain.User;
import dev.yassiraitelghari.repositories.UserRepository;
import dev.yassiraitelghari.services.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static User currentUser;
    private static UserService userService = new UserService();
    public static void main(String[] args) {
        logo();
        while (currentUser ==null){
            notAuthMenu();
        }

    }

    public static  void logo(){
        System.out.println(
                """
                        
                          __  __                      \s
                         |  \\/  |                     \s
                         | \\  / | __ ___   _____ _ __ \s
                         | |\\/| |/ _` \\ \\ / / _ \\ '_ \\\s
                         | |  | | (_| |\\ V /  __/ | | |
                         |_|  |_|\\__,_| \\_/ \\___|_| |_|
                                                      \s
                                                      \s
                                                
                        """
        );
    }
    public static void notAuthMenu(){
        logo();
        Scanner input = new Scanner(System.in);
        System.out.println("Ener your name to login");
        String name = input.nextLine();
        if(userService.isUserAdmin(name)){
            authMenu();
        }else{
            System.out.println("sorry but ,access only for admin");
            main(null);
        }
    }

    public static void authMenu(){
        logo();
        Scanner input = new Scanner(System.in);
        System.out.println(
                """
                        1-create user
                        2-delete all users 
                        3-update my info 
                        4- see all users 
                        5- filter users with salaray 
                        6-filter users by age 
                        7-filter users by department 
                        """
        );

        System.out.println("Ener your option");
        int choice = input.nextInt();
        switch (choice){
            case 1 : createUser() ; break;
            case 2: deleteAllUsers() ;break;
            case 3: updateUserInfo();break;
            case 4: seeAllUsers();break;
            case 5:filterUsersBySalary(); break;
            case 6: filterUsersByAge() ; break;
            case 7:filterUsersByDepartment(); break;
            default:
                System.out.println("please choose a valid option ");
                authMenu();

        }

    }
    public static void createUser() {
        Scanner input = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        Scanner inputFloat = new Scanner(System.in);


        System.out.println("Enter name");
        String name = input.nextLine();
        System.out.println("Enter age");
        String age = inputInt.nextLine();
        System.out.println("Enter salary");
        float salary = inputFloat.nextFloat();
        System.out.println("Enter department doctor-professor-engineering");
        String departement = input.nextLine();


    }

    public static void deleteAllUsers() {
        // Logic to delete all users
        System.out.println("Deleting all users...");
    }

    public static void updateUserInfo() {
        // Logic to update user information
        System.out.println("Updating user information...");
    }

    public static void seeAllUsers() {
        // Logic to see all users
        System.out.println("Displaying all users...");
    }

    public static void filterUsersBySalary() {
        // Logic to filter users by salary
        System.out.println("Filtering users with salary greater than " + minSalary + "...");
    }

    public static void filterUsersByAge() {
        // Logic to filter users by age
        System.out.println("Filtering users older than " + minAge + "...");
    }

    public static void filterUsersByDepartment() {
        // Logic to filter users by department
        System.out.println("Filtering users in department: " + department + "...");
    }
}