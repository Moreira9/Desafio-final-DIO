
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Mago mago = new Mago();
        Monge monge = new Monge();
        Guerreiro guerreiro = new Guerreiro();
        Ninja ninja = new Ninja();
        int opcao;
        ArrayList<Heroi> herois = new ArrayList<>();

        do {
            System.out.println("MENU");
            System.out.println("    1-Criar um Mago");
            System.out.println("    2-Criar um Guerreiro");
            System.out.println("    3-Criar um Ninja");
            System.out.println("    4-Criar um Monge");
            System.out.println("    5-ATACAR!!!");
            System.out.println("    6-Sair");
            System.out.print(">>");
            opcao = Integer.parseInt(ler.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do Mago");
                    mago.setNome(ler.nextLine());
                    System.out.println("Digite a idade do Mago");
                    mago.setIdade(Integer.parseInt(ler.nextLine()));
                    System.out.println("Mago Criado com sucesso.");
                    herois.add(mago);
                    break;
                case 2:
                    System.out.println("Digite o nome do Guerreiro");
                    guerreiro.setNome(ler.nextLine());
                    System.out.println("Digite a idade do Guerreiro");
                    guerreiro.setIdade(Integer.parseInt(ler.nextLine()));
                    System.out.println("Guerreiro Criado com sucesso.");
                    herois.add(guerreiro);
                    break;
                case 3:
                    System.out.println("Digite o nome do Ninja");
                    ninja.setNome(ler.nextLine());
                    System.out.println("Digite a idade do Ninja");
                    ninja.setIdade(Integer.parseInt(ler.nextLine()));
                    System.out.println("Ninja Criado com sucesso.");
                    herois.add(ninja);
                    break;
                case 4:
                    System.out.println("Digite o nome do Monge");
                    monge.setNome(ler.nextLine());
                    System.out.println("Digite a idade do Monge");
                    monge.setIdade(Integer.parseInt(ler.nextLine()));
                    System.out.println("Monge Criado com sucesso.");
                    herois.add(monge);
                    break;
                case 5:
                    for (Heroi heroi : herois) {
                        if (heroi instanceof Mago) {
                            Mago m = (Mago) heroi;
                            System.out.println(m.atacar() + "\n");
                        } else if (heroi instanceof Monge) {
                            Monge mo = (Monge) heroi;
                            System.out.println(mo.atacar() + "\n");
                        } else if (heroi instanceof Guerreiro) {
                            Guerreiro g = (Guerreiro) heroi;
                            System.out.println(g.atacar() + "\n");
                        } else if (heroi instanceof Ninja) {
                            Ninja n = (Ninja) heroi;
                            System.out.println(n.atacar() + "\n");
                        }
                      
                    }
                    break;

                case 6:
                    System.out.println("Fim dos ataques");
                    break;
            }

        } while (opcao != 6);

    }

}
