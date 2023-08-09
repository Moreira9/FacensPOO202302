package Fundamentos;

/**
 *
 * @author edson
 */
public class Pessoa {
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
