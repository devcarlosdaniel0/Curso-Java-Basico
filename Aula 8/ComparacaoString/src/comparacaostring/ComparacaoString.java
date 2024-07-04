/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Carlos - PC
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Carlos";
        String nome2 = "Carlos";
        String nome3 = new String("Carlos");
        String res;
        //res = (nome1==nome2)?"igual":"diferente"; 
        res = (nome2.equals(nome3)?"igual":"diferente"); // se o conteudo do nome2 = conteudo nome 3
        System.out.println(res);
    }
    
}
