/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_1;

import java.util.Scanner;
/**
 *
 * @author xMinatwoah
 */
public class Basic_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        Expected Output :
        Hello
        Alexandra Abramov
        */
        Scanner scanner = new Scanner(System.in);
        
        String firstName;
        String lastName;
        
        // To read the string entered by the user and stores it inside firstName
        System.out.println("Please enter first name: ");
        firstName = scanner.next();
        // To read the string entered by the user and stores it inside lastName
        System.out.println("Please enter your last name: ");
        lastName = scanner.next();
        
        System.out.println("Hello" + "\n" + firstName + " " + lastName);
        
    }
    
}
