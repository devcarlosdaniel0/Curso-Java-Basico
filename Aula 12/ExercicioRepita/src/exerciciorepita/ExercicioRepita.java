/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos - PC
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, soma = 0, totVal = 0, totPar = 0, totImpar = 0, tot100 = 0;
        float media;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um número <br><em>Digite 0 para parar</em></html>"));
            soma += num;
            
            if (num != 0) {
                totVal++;
                
                if (num % 2 == 0) {
                    totPar++;
                } else {
                    totImpar++;
                }
            }
            
            if (num > 100) {
                tot100++;
            }
            
        } while (num != 0);
        
        media = (float) soma/totVal;
        
        JOptionPane.showMessageDialog(null, "<html> Resultado Final <hr> Total de valores: " + totVal + "<br> Total de pares: " + totPar
                + "<br> Total de ímpares: " + totImpar + "<br> Acima de 100: " + tot100 + "<br> Média: " + media + "</html>");
    }
    
}
