/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author Carlos - PC
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner teclado = new Scanner(System.in);
        int ano;
        boolean bi;
        int soma = 0;
        
        System.out.print("Em que ano você está? ");
        ano = teclado.nextInt();
        bi = Year.isLeap(ano);
        
        if (bi == true) {
                tot[1] += 1;
                System.out.println("O ano de " + ano + " é bissexto");
                System.out.println("-------------------");
            } else {
            System.out.println("O ano de " + ano + " não é bissexto");
            System.out.println("-------------------");
        }
        
        for (int i = 0; i < mes.length; i++) {
            soma += tot[i]; 
            System.out.println("O mes de " + mes[i] + " tem " + tot[i] + " dias.");
        }
        System.out.println("Ano com " + soma + " dias ao todo.");
    }
    
}
