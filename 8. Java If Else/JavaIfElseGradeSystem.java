/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yasin
 */
public class JavaIfElseGradeSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int number = 63; // 0 - 100
        
        // Grade A 90 - 100
        // Grade B 80 - 89
        // Grade C 70 - 78
        // Grade D 0 - 69
       
        if (number >= 90 && number <= 100){   
            
            System.out.print("Grade A");
            
        }else if (number >= 80 && number <= 89){
            
            System.out.print("Grade B");
            
        }else if (number >= 70 && number <= 79){
            
            System.out.print("Grade C");
            
        }else if (number >= 0 && number <= 69){
            
            System.out.print("Grade D");
            
        }else{
            
            System.out.print("The number is out of our grade");
            
        }
    }
}
