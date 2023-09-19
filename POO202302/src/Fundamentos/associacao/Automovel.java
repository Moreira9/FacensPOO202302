package Fundamentos.associacao;

public class Automovel {

    //private String modelo;
    protected String cor;
    int ano;
    private Motor motor;
    private Pessoa dono;

    public Automovel(String cor, int ano) {
        //this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = new Motor(this);
       
    }

    @Override
    public String toString() {
        return "Minha cor é "+this.cor;
    }
    

    public void acelerar() {
        motor.setFatorPotencia(
                motor.getFatorPotencia() + 1
        );
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void setDono(Pessoa dono){
        this.dono = dono;
    }
    public Pessoa getDono(){
        return dono;
    }
    
    public void frear() {
        if (motor.getFatorPotencia() > 0) {
            motor.setFatorPotencia(
                    motor.getFatorPotencia() + 1
            );
        }
    }
    
}
