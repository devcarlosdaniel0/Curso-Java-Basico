/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Carlos - PC
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int soma = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número ");
            num = teclado.nextInt();
            soma += num; // soma = soma + num
            System.out.print("Continuar? [S / N] ");
            resp = teclado.next();
        } while (resp.equals("S") || resp.equals("s"));
        System.out.println("A soma é igual a " + soma);
    }
    
}
