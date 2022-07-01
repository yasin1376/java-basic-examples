/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yasin
 */
public class JavaDoWhileLoopSum1To100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        int i = 1;
        int sum = 0;

        do {

            sum += i;
            
            i++;
            

        } while (i <= 100);
        
        System.out.println(sum);
    }
}
