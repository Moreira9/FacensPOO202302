package Fundamentos.Lista03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        /*
        Menu:
        1 – Criar Curso
        2 – Criar Aluno (Perguntar os dados do aluno e escolher o curso do aluno)
        3 – Remover Aluno
        4 – Mostrar Todos os Cursos
        5 – Mostrar alunos do curso
        6 – Sair
         */
        Scanner tec = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();
        int opcao = 0;
        while (opcao != 6) {
            System.out.println("1 – Criar Curso");
            System.out.println("2 – Criar Aluno");
            System.out.println("3 – Remover Aluno");
            System.out.println("4 – Mostrar Todos os Cursos");
            System.out.println("5 – Mostrar alunos do curso");
            System.out.println("6 – Sair");
            opcao = Integer.parseInt(tec.nextLine());
            switch (opcao) {
                case 1:
                    //1 – Criar Curso
                    Curso c = new Curso();
                    System.out.println("Digite o código do curso");
                    c.setCodigo(Integer.parseInt(tec.nextLine()));
                    System.out.println("Digite o nome");
                    c.setNome(tec.nextLine());
                    System.out.println("Digite a carga horária");
                    c.setCargaHoraria(Integer.parseInt(tec.nextLine()));
                    cursos.add(c);
                    break;
                case 2:
                    //2 – Criar Aluno
                    Aluno al = new Aluno();
                    System.out.println("Digite o RA");
                    al.setRa(tec.nextLine());
                    System.out.println("Digite o nome");
                    al.setNome(tec.nextLine());
                    System.out.println("Escolha o curso");
                    int cursoEscolhido;
                    for (int i = 0; i < cursos.size(); i++) {
                        int x = i + 1;
                        System.out.println(x + " - " + cursos.get(i).getNome());
                    }
                    cursoEscolhido = Integer.parseInt(tec.nextLine());
                    cursoEscolhido = cursoEscolhido - 1;
                    cursos.get(cursoEscolhido).setAluno(al);
                    break;
                case 3:
                    //3 – Remover Aluno
                    System.out.println("Digite o RA do aluno");
                    String raAluno = tec.nextLine();
                    for (Curso curso : cursos) {
                        for (int i = 0; i < curso.getAlunos().size(); i++) {
                            String raAtual = curso.getAlunos().get(i).getRa();
                            if (raAluno.equals(raAtual)) {
                                curso.removerAluno(i);
                            }
                        }
                    }
                    break;
                case 4:
                    //4 – Mostrar Todos os Cursos
                    for (Curso curso : cursos) {
                        System.out.println(curso.imprimir());
                    }
                    break;
                case 5:
                    //5 – Mostrar alunos do curso
                    for(Curso curso : cursos){
                        System.out.println(curso.imprimirCompleto());
                    }
                    break;
                case 6:
                    //6 – Sair
                    System.out.println("O programa será fechado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
