/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yasin
 */
public class JavaWhileLoop1To100EvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int x = 1;
 
        while (x <= 100) {

            if (x % 2 == 0) {
                System.out.println(x);
            }

            x++;
        }
    }
}
