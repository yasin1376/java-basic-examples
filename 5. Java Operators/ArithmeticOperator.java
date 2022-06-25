/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yasin
 */
public class ArithmeticOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int sum = 34 + 54; // +         Addition        Adds together two values
        int sub = 65 - 32; // -         Subtraction     Subtracts one value from another
        int mul = 79 * 12; // *         Multiplication  Multiplies two values	
        int div = 42 / 6;  // /         Division	  Divides one value by another
        int mod = 65 % 29; // %         Modulus	  Returns the division remainder
        int increment = 34;
        increment++;      // ++         Increment	  Increases the value of a variable by 1
        int decrement = 76;
        decrement--;      // --         Decrement	  Decreases the value of a variable by 1
        
        System.out.println("Addition: " + sum);
        System.out.println("Substraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
        System.out.println("Increment: " + increment);
        System.out.println("Decrement: " + decrement);
        
    }
}
