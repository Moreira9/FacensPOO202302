package Fundamentos.associacao;

public class Automovel {

    private String modelo;
    private String cor;
    private int ano;
    private Motor motor;
    private Pessoa dono;

    public Automovel(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = new Motor(this);
    }

    public void acelerar() {
        motor.setFatorPotencia(
                motor.getFatorPotencia() + 1
        );
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
