/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_4;

import java.util.Scanner;
/**
 *
 * @author xMinatwoah
 */
public class Basic_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Write a Java program to print the result of the following operations.        
        */
        Scanner scanner = new Scanner(System.in);
        
        // variables
        double first;
        double second;
        double result;
        
        // operations
        int operationSelected;
        int add = 1;
        int sub = 2;
        int mult = 3;
        int div = 4;
        
        System.out.println("Please choose the operation you want: " + "\n1 - add, 2 - sub, 3 - mult, 4 - div, else 0 - exit");
        operationSelected = scanner.nextInt();
            if(operationSelected == add){
                System.out.println("Operation Selected: Addition");
                System.out.println("Please enter the first number: ");
                first = scanner.nextDouble();
                System.out.println("Please enter the second number: ");
                second = scanner.nextDouble();
                result = first + second;
                System.out.println("Result " + result);
            }
            else if(operationSelected == sub){
                System.out.println("Operation Selected: Subtraction");
                System.out.println("Please enter the first number: ");
                first = scanner.nextDouble();
                System.out.println("Please enter the second number: ");
                second = scanner.nextDouble();
                result = first - second;
                System.out.println("Result " + result);
            }
            else if(operationSelected == mult){
                System.out.println("Operation Selected: Multiplication");
                System.out.println("Please enter the first number: ");
                first = scanner.nextDouble();
                System.out.println("Please enter the second number: ");
                second = scanner.nextDouble();
                result = first * second;
                System.out.println("Result " + result);
            }
            else if(operationSelected == div){
                System.out.println("Operation Selected: Division");
                System.out.println("Please enter the first number: ");
                first = scanner.nextDouble();
                System.out.println("Please enter the second number: ");
                second = scanner.nextDouble();
                result = first / second;
                System.out.println("Result " + result);
            
        }
    }
}
