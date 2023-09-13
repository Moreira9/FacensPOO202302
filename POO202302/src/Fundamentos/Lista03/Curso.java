package Fundamentos.Lista03;

import java.util.ArrayList;
import java.util.Objects;

public class Curso {

    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos = 
            new ArrayList<Aluno>();

    public Curso() {
    }

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    
    public void inserirAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public void removerAluno(int index){
        this.alunos.remove(index);
    }
    public String imprimir(){
        String retorno = "";
        retorno += "Código: "+codigo +"\n";
        retorno += "Nome: "+nome + "\n";
        retorno += "Carga horária: "+ cargaHoraria;
        return retorno;
    }
    public String imprimirCompleto(){
        String retorno = imprimir() + "\n";
        for (Aluno aluno : alunos) {
            retorno += aluno.imprimir() + "\n";
        }
        return retorno;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public void setAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
        @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codigo;
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + this.cargaHoraria;
        hash = 53 * hash + Objects.hashCode(this.alunos);
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
        final Curso other = (Curso) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.cargaHoraria != other.cargaHoraria) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.alunos, other.alunos);
    }
    
}
