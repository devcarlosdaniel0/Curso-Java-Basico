/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Carlos - PC
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = {3,7,6,1,9,4,2};
        for (int v:vetor) {
            System.out.print(v + " ");
        }
        
        System.out.println("");
        
        int valor = 1;
        
        int pos = Arrays.binarySearch(vetor, valor);
        System.out.println("O valor " + valor + " está na posicao " + pos);
    }
    
}
