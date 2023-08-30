package revisao;

import javax.swing.JOptionPane;

/**
 *
 * @author edson
 */
public class MensagemPopup {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá! Tudo bem?");
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome",
                "Exemplo de popup", 0);
        JOptionPane.showMessageDialog(null, "Seja bem vindo "+ nome, 
                "Exemplo do professor", 0);
    }
}
