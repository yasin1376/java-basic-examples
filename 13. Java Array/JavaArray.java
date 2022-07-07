/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yasin
 */
public class JavaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        // Arrays are used to store multiple values in a single variable
        
        String[] names = {"Ahmad", "Ali", "Mahmood"};
        
        // Access the Elements of an Array
        
        System.out.println(names[0]);
        
        // Change an Array Element
        
        names[0] = "Habib";
        System.out.println(names[0]);
        
        // Array Length
        
        System.out.println("Total length : " + names.length);
        
    }
}
