/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author User
 */
public class AlunoGraduacao extends Aluno {

    private String anoConclusaoEnsinoMedio;
    private double ac1;
    private double ac2;
    private double af;
    private double ag;

    public AlunoGraduacao() {

    }

    public AlunoGraduacao(String nome, String curso, String anoConclusao) {
        super(nome, curso, anoConclusao);

    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nRA: " + getRa() + "\nCurso: "
                + getCurso() + "\nMedia: " + calcularMedia() +
                "\nVerificar Aprovação" + verificarAprovacao();
    }

    @Override
    public double calcularMedia() {
        return ac1 * 0.1 + ac2 * 0.3 + ag * 0.2 + af * 0.4;

    }

    @Override
    public String verificarAprovacao() {
        if(calcularMedia() >= 5){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }            
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public double getAc1() {
        return ac1;
    }

    public void setAc1(double ac1) {
        this.ac1 = ac1;
    }

    public double getAc2() {
        return ac2;
    }

    public void setAc2(double ac2) {
        this.ac2 = ac2;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }

    public double getAg() {
        return ag;
    }

    public void setAg(double ag) {
        this.ag = ag;
    }
    
    
    
    
}
