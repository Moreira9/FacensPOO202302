package Fundamentos.Lista02;

/**
 *
 * @author edson
 */
public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice() {
    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }
    public double calcularValor(){
        double resultado = 0;
        if (sexo == 'M' && idade <= 25) {
            resultado = valorAutomovel * 10 / 100;
        }
        if (sexo == 'M' && idade > 25) {
            resultado = valorAutomovel * 5/100;
        }
        if(sexo == 'F'){
	resultado = valorAutomovel * 2/100;
        }
        return resultado;
    }
    public String imprimir(){
        String impressao = "";
        impressao += "Número: "+ this.numero;
        impressao += "\nNome: " + this.nome;
        impressao += "\nIdade: " + this.idade;
        impressao += "\nSexo : " + this.sexo;
        impressao += "\nValor Automóvel: "+valorAutomovel;
        impressao += "\nValor Apolice: "+ calcularValor();
        return impressao;
    }
    
}
