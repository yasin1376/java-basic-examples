/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yasin
 */
public class JavaSwitchVowelCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        // switch           ==
        // if else          == > < >= <=
        
        char myCharacter = 'x';           //  a , e , i , o , u
                
        switch(myCharacter){

            case 'a':
                System.out.print("The character is vowel.");
                break;

            case 'e':
                System.out.print("The character is vowel.");
                break;

            case 'i':
                System.out.print("the character is vowel.");
                break;

            case 'o':
                System.out.print("the character is vowel");
                break;

            case 'u':
                System.out.print("the character is vowel");
                break;

            default:
                System.out.print("The character is not vowel");
        }
    }
}
