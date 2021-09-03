/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_41;

/**
 *
 * @author xMinatwoah
 */
public class Basic_41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Write a Java program to print the result of the following operations. 
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13
        */
        // you can initialize or store data in one line: like double a, b, c, d / double a = 1, b = 2, c = 3, d =4
        double a;
        double b;
        double c;
        double d;
       
        
        // computation/formula
        a = -5 + 8 * 6;
        b = (55 + 9) % 9;
        c = 20 + -3 * 5 /8;
        d = 5 + 15 / 3 * 2 -8 % 3;
        
        System.out.print("Results are: \n" + a + "\n"+ b + "\n"+ c +"\n"+ d);
    }
    
}
