/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @Matheus Moreira de Arruda
 */
public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(double raio) {

    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * 2;
    }
    
      @Override
    public String toString(){
        return "Raio:" + raio + 
                "\nArea do Circulo: " + calcularArea() + "\n";
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    

}
