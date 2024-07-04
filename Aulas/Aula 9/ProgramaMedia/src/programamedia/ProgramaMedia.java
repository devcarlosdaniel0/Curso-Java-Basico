/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Carlos - PC
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota 1: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Nota 2: ");
        float n2 = teclado.nextFloat();
        
        float media = (n1+n2)/2;
        System.out.println("Sua média foi " + media);
        if (media > 9) {
            System.out.println("Parabéns");
        } else {
            System.out.println("Melhore!");
        }
    }
    
}
