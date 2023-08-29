package Fundamentos.lista;

import java.util.ArrayList;

public class AulaLista {
    public static void main(String[] args) {
        //array
        /*
        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        
        System.out.println(numeros[1]);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("valor: "+numeros[i]);
        }
        
        for (int numero : numeros) {
            System.out.println("--> " + numero);
        }
        //chefe pediu para colocar esse num no array
        int numeroChefe = 100;
        int[] novoArray = new int[4];
        
        for (int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i];
        }
        novoArray[3] = numeroChefe;
        
        for (int novo : novoArray) {
            System.out.println("Novo Array= "+novo);
        }
        */
        //arrayList
        ArrayList<String> nomes = new ArrayList<>();
        //adicionar na lista
        nomes.add("Edson");
        nomes.add("Renata");
        nomes.add("Victor");
        nomes.add("Vinícius");
        System.out.println(nomes);
        nomes.add(1, "Daniela");
        System.out.println(nomes);
        
        if(nomes.contains("Renata"))
            System.out.println("A Renata está na lista");
        System.out.println(nomes.get(3));
        System.out.println("Posição do Vinícius: "+
                nomes.indexOf("Vinícius"));
        //remover da lista
        nomes.remove(2);
        System.out.println(nomes);
        nomes.remove("Daniela");
        System.out.println(nomes);
        //atualizar itens na lista
        nomes.set(1, "Maria");
        System.out.println(nomes);
        //
        Fornecedor f1 = new Fornecedor();
        f1.setNome("Bic");
        Produto p1 = new Produto();
        p1.setNome("caneta");
        p1.setValor(1.50);
        Produto p2 = new Produto();
        p2.setNome("caderno");
        f1.setProduto(p1);
        f1.setProduto(p2);
        System.out.println(
        "Fornecedor "+f1.getNome() +
        " tem como produto " + 
                f1.getProdutos().get(0).getNome());
        Fornecedor f2 = new Fornecedor();
        f2.setNome("hp");
        Produto p3 = new Produto();
        p3.setNome("notebook");
        Produto p4 = new Produto();
        p4.setNome("impressora");
        f2.setProduto(p3);
        f2.setProduto(p4);
        
        ArrayList<Fornecedor> fornecedores = 
                new ArrayList<>();
        fornecedores.add(f1);
        fornecedores.add(f2);
        
        for (Fornecedor forn : fornecedores) {
            System.out.println("- "+ forn.getNome());
            for(Produto pr : forn.getProdutos()){
                System.out.println("   - Produto: "+ pr.getNome());
            }
        }
    }
}
