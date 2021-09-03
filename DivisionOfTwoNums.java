/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_3;

import java.util.Scanner;
/**
 *
 * @author xMinatwoah
 */
public class Basic_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Write a Java program to divide two numbers and print on the screen. 
        Test Data :
        50/3
        Expected Output :
        16
        */
        Scanner scanner = new Scanner(System.in);
        
        // variables
        double firstNum;
        double secondNum;
        double result;
        
        System.out.println("Please enter the first number: ");
        firstNum = scanner.nextDouble();
        System.out.println("Please enter the second number: ");
        secondNum = scanner.nextDouble();
        
        if(firstNum > secondNum){
            //System.out.println("The numbers are valid!");
            result = firstNum / secondNum;
            System.out.println("The result is: " + result);
        }
        else if(secondNum == firstNum){
            System.out.println("The numbers are similar" + "\nThe result is 1");
        }
        else {
            System.out.println("The numbers are invalid!");
        }         
    }  
}
