/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yasin
 */
public class JavaContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int i = 1;
        while (i <= 20) {

            if (i == 5 || i == 6 || i == 9) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
