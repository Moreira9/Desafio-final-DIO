/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author User
 */
public class AlunoPosGraduacao extends Aluno {

    private String anoCloclusaoGraduacao;
    private double nota1;
    private double nota2;

    public AlunoPosGraduacao() {

    }

    public AlunoPosGraduacao(String nome, String curso, String anoCloclusao) {
        super(nome, curso, anoCloclusao);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nRA: " + getRa() + "\nCurso: "
                + getCurso() + "\nMedia: " + calcularMedia()
                + "\nVerificar Aprovação" + verificarAprovacao();
    }

    @Override
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String verificarAprovacao() {
        if (calcularMedia() >= 5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getAnoCloclusaoGraduacao() {
        return anoCloclusaoGraduacao;
    }

    public void setAnoCloclusaoGraduacao(String anoCloclusaoGraduacao) {
        this.anoCloclusaoGraduacao = anoCloclusaoGraduacao;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

}
