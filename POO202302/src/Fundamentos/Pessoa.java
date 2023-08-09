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
    
}
