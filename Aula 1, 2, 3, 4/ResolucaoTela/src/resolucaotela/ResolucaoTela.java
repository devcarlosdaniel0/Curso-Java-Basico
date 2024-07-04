package resolucaotela;

import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit res = Toolkit.getDefaultToolkit();
        int width = res.getScreenSize().width; //largura da tela do usuário
        int height = res.getScreenSize().height; //altura da tela do usuário
        System.out.println("Sua resolução é: " + width + " x " + height);
    }
    
}
