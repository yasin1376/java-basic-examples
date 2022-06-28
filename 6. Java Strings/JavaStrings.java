/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yasin
 */
public class JavaStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        // A String variable contains a collection of characters surrounded by double quotes
        
        String greeting = "Hello";
        System.out.println(greeting);
        
        /* A String in Java is actually an object, which contain methods that can perform certain 
            operations on strings. For example, the length of a string can be found with the 
            length() method */
        
        String txt = "AFGHANISTAN";
        System.out.println("The length of the txt string is: " + txt.length());
        
        String text = "Hello World";
        System.out.println(text.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(text.toLowerCase());   // Outputs "hello world"
        
        /* The indexOf() method returns the index (the position) of the first occurrence
            of a specified text in a string (including whitespace) */
        
        String sentence = "Please locate where 'locate' occurs!";
        System.out.println(sentence.indexOf("locate")); // Outputs 7
        
    }
}
