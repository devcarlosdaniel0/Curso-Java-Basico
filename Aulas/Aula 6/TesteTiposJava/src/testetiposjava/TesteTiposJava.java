package testetiposjava;

public class TesteTiposJava {

    public static void main(String[] args) {
        /*
        INTEIRO PARA STRING
        
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor); */
        
        /*
        STRING PARA INTEIRO
        
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade); */
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.2f \n", idade);
    }
    
}
