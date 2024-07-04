package testefuncao01;

public class TesteFuncao01 {
    
    /* PROCEDIMENTO
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    } */
    
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        int s1 = soma(5,5);
        int s2 = soma(4,3);
        System.out.println("A primeira soma é " + s1 + " e a segunda soma é " + s2);
    }
    
}