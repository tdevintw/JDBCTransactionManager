package dev.yassiraitelghari.services;

import dev.yassiraitelghari.domain.Departement;
import dev.yassiraitelghari.domain.User;
import dev.yassiraitelghari.repositories.UserRepository;

import java.util.Scanner;

public class UserService {

    private static UserRepository userRepository = new UserRepository();
    public boolean isUserAdmin(String name){
        return name.equals("admin");
    }

    public static boolean createUser(String name , int age , float salary , String departement) {
        User newUser = new  User(name , age , Departement.valueOf(departement) , salary);
       return  userRepository.add(newUser);
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
