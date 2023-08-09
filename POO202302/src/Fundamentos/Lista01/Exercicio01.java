package Fundamentos.Lista01;

import java.util.Scanner;

/**
 *
 * @author edson
 */
public class Exercicio01 {
    public static void main(String[] args) {
        /*
        Menu:
1 – Criar pessoa
2 – Mostrar pessoa
3 – Sair
        */
        Pessoa p = new Pessoa();
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3) {            
            System.out.println("Menu:");
            System.out.println("1 – Criar pessoa");
            System.out.println("2 – Mostrar pessoa");
            System.out.println("3 - Sair");
            opcao = Integer.parseInt(teclado.nextLine());
            switch (opcao) {
                case 1:
                    //Criar pessoa
                    break;
                case 2:
                    //mostrar pessoa
                    break;
                case 3:
                    System.out.println("O programa será fechado");
                    break;
                default:
                    System.out.println("opcão inválida!");
            }
        }
        teclado.close();
    }
}
