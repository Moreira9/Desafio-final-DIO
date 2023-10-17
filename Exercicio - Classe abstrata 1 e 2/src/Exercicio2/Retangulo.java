/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @Matheus Moreira de Arruda
 */
public class Retangulo extends FormaGeometrica {

    private double largura;
    private double altura;

    public Retangulo(double altura, double largura) {

    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }
    
    @Override
    public String toString(){
        return "Altura:" + altura + "\nLargura: " + largura + 
                "\nArea do Retangulo: " + calcularArea() + "\n";
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

}
