/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yasin
 */
public class StringConcatenation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        // The + operator can be used between strings to combine them. This is called concatenation
        
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName + lastName);
        
        // You can also use the concat() method to concatenate two strings
        
        System.out.println(firstName.concat(lastName));
    }
}
