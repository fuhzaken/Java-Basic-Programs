/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author xMinatwoah
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // @description: Using arrays in Java with For loop
        
        // arrrays
        double[] arrayOfNumbers = {1, 4, 6, 8, 10, 15}; // array of doubles
        String[] arrayOfStrings = {"Hello,","I","Love","Java","Programming"}; // array of Strings
        char[] arrayOfCharacters = {'a','b','c','d','e'}; // array of characters
        
        double sum = 0;
        // array of numbers: adding all the numbers inside the array
        for(int i = 0; i < arrayOfNumbers.length; i++){
            sum += arrayOfNumbers[i];   
        }
        System.out.print("The sum of the numbers inside the arrayOfNumbers is: " + sum);
        
        System.out.println(); // gives one line space
        // array of strings: print all the strings in the same line
        for(int i = 0; i < arrayOfStrings.length; i++){
            System.out.print(arrayOfStrings[i] + " ");
        }
        
        System.out.println(); // gives one line space
        // array of characters
        for(int i = 0; i < arrayOfCharacters.length; i++){
            System.out.print(arrayOfCharacters[i] + " ");
        }
    }
    
}
