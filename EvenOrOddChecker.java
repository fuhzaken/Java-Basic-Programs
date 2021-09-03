/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenoroddchecker;

import java.util.Scanner;
/**
 *
 * @author xMinatwoah
 */
public class EvenOrOddChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // @description Java Program to check whether the number is odd or even
        Scanner scanner = new Scanner(System.in);
        
        // variable(s)
        int num;       
        
        // scans the given number
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();
        
        // if the remainder of the entered number when divided by 2 is 0, we can conclude that the entered number is an even number
        if(num % 2 == 0){
            System.out.println("The number " + num + " is even!");
        }
        else{
            // else, the given number is odd
            System.out.println("The number " + num + " is odd!");
        }  
    } 
}
