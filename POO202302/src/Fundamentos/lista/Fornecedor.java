package Fundamentos.lista;

import java.util.ArrayList;

public class Fornecedor {
    private String nome;
    private ArrayList<Produto> produtos = 
            new ArrayList<Produto>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void setProduto(Produto produto){
        produtos.add(produto);
    }
}
