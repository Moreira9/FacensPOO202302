package Fundamentos;

import java.util.Objects;

/**
 *
 * @author edson
 */
public class Pessoa {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.telefone);
        hash = 79 * hash + this.idade;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.telefone, other.telefone);
    }
    //atributos - características
    private String nome;
    private String telefone;
    private int idade;
    
    //métodos - ações
    public String perguntarONome(Pessoa pessoa){
        //return "Qual é o seu nome?";
        String conversa = "";
        conversa += "Qual é o seu nome? \n";
        conversa += pessoa.responderONome();
        return conversa;
    }
    public void DarUmNome(String nome){
        this.nome = nome;
    }
    public String responderONome(){
        return "Meu nome é "+this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
