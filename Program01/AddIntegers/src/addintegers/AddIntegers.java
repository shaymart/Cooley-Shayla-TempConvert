/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addintegers;

import java.util.Scanner;

public class AddIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1, n2, tempF, tempC;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the temperature in Celsius");
        tempC = keyboard.nextDouble();
       
  
        tempF = (9.0/5.0) * tempC + 32.0;
        System.out.println("The temperature in Fahrenheit is: " + sum);
      
    }
    
}
