/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yasin
 */
public class JavaWhileLoopSum1To100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int i = 1;
        int sum = 0;

        while (i <= 100) {

            sum = sum + i;

            i++;
        }

        System.out.println(sum);
    }
}
