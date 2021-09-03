/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_2;

import java.util.Scanner;
/**
 *
 * @author xMinatwoah
 */
public class Basic_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Write a Java program to print the sum of two numbers. 
        Test Data:
        74 + 36
        Expected Output :
        110
        */
        Scanner scanner = new Scanner(System.in);
        
        // variables to store the first and second number, including the result(sum)
        double firstNum;
        double secondNum;
        double result;
        
        System.out.println("Please enter the first number: ");
        firstNum = scanner.nextDouble();
        System.out.println("Please enter the second number: ");
        secondNum = scanner.nextDouble();
        
        result = firstNum + secondNum;
        
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + result);
        
    }
    
}
