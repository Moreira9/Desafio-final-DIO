/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Menu {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double raio = 0;
        Circulo circulo = new Circulo(raio);
        double altura = 0;
        double largura = 0;
        Retangulo retangulo = new Retangulo(altura, largura);
        int opcao = 0;
        ArrayList<FormaGeometrica> formageometricas = new ArrayList<>();

        while (opcao != 3) {
            System.out.println("\n" +"Menu");
            System.out.println("    1-Inserir e calcular area");
            System.out.println("    2-Mostrar todas as forma inseridas");
            System.out.println("    3-Sair");
            System.out.print(">> ");
            opcao = Integer.parseInt(ler.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Deseja Inserir um Circulo?[s/n]");
                    String confirmacao = ler.nextLine();
                    if (confirmacao.equals("s")) {
                        System.out.println("Raio:");
                        circulo.setRaio(Double.parseDouble(ler.nextLine()));
                        System.out.print("A Area do Circulo é "
                                + circulo.calcularArea());
                        formageometricas.add(circulo);

                    } else if (confirmacao.equals("n")) {
                        System.out.println("Deseja Inserir um Retangulo[s/n]");
                        confirmacao = ler.nextLine();
                        if (confirmacao.endsWith("s")) {
                            System.out.println("Largura:");
                            retangulo.setLargura(Double.parseDouble(ler.nextLine()));
                            System.out.println("Altura");
                            retangulo.setAltura(Double.parseDouble(ler.nextLine()));
                            System.out.println("Area do Retangulo é "
                                    + retangulo.calcularArea()+ "\n");
                            formageometricas.add(retangulo);

                        }
                    } else {
                        System.out.println("Valor Digita invalido, retornaremos ao Menu");
                    }
                    break;
                case 2:
                    for (FormaGeometrica formageometrica : formageometricas) {
                        if (formageometrica instanceof Retangulo) {
                            Retangulo rtg = (Retangulo) formageometrica;
                            System.out.println(rtg.toString());

                        } else if (formageometrica instanceof Circulo) {
                            Circulo cl = (Circulo) formageometrica;
                            System.out.println(cl.toString());
                        }

                    }
                    break;
                    
                case 3:
                    System.out.println("Obrigado Até a Proxima");

            }

        }

    }

}
