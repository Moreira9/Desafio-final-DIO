package Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @Matheus Moreira de Arruda
 */
public class Menu {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        AlunoGraduacao alunograduacao = new AlunoGraduacao();
        AlunoPosGraduacao alunoposgraduacao = new AlunoPosGraduacao();
        ArrayList<Aluno> alunos = new ArrayList<>();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Menu");
            System.out.println("    1-Inserir Aluno");
            System.out.println("    2-Mostrar Aluno");
            System.out.println("    3-Sair do programa");
            System.out.print(">>");
            opcao = Integer.parseInt(ler.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Deseja Criar Aluno de Graduacao?[s/n]");
                    String confirmacao = ler.nextLine();
                    if (confirmacao.equals("s")) {
                        System.out.println("Nome: ");
                        alunograduacao.setNome(ler.nextLine());
                        System.out.println("RA: ");
                        alunograduacao.setRa(ler.nextLine());
                        System.out.println("Curso: ");
                        alunograduacao.setCurso(ler.nextLine());
                        System.out.println("Ano de Conclusão do Ensino Medio");
                        alunograduacao.setAnoConclusaoEnsinoMedio(ler.nextLine());
                        System.out.println("Nota Ac1: ");
                        alunograduacao.setAc1(Double.parseDouble(ler.nextLine()));
                        System.out.println("Nota Ac2: ");
                        alunograduacao.setAc2(Double.parseDouble(ler.nextLine()));
                        System.out.println("Nota AG: ");
                        alunograduacao.setAg(Double.parseDouble(ler.nextLine()));
                        System.out.println("Nota AF: ");
                        alunograduacao.setAf(Double.parseDouble(ler.nextLine()));
                        alunos.add(alunograduacao);
                    } else if (confirmacao.equals("n")) {
                        System.out.println("Deseja Criar Aluno de Pos Graduacao?[s/n]");
                        confirmacao = ler.nextLine();
                        if (confirmacao.equals("s")) {
                            System.out.println("Nome: ");
                            alunoposgraduacao.setNome(ler.nextLine());
                            System.out.println("RA: ");
                            alunoposgraduacao.setRa(ler.nextLine());
                            System.out.println("Curso: ");
                            alunoposgraduacao.setCurso(ler.nextLine());
                            System.out.println("Ano de Conclusão da Graduacao");
                            alunoposgraduacao.setAnoCloclusaoGraduacao(ler.nextLine());
                            System.out.println("Nota 1: ");
                            alunoposgraduacao.setNota1(Double.parseDouble(ler.nextLine()));
                            System.out.println("Nota 2: ");
                            alunoposgraduacao.setNota2(Double.parseDouble(ler.nextLine()));
                            alunos.add(alunoposgraduacao);
                        }
                        else if(confirmacao.equals("n")){
                            System.out.println("Retornaremos ao Menu");
                        }
                    } else {
                        System.out.println("Opção invalidade\nVoltaremos ao Menu Inicial");
                    }
                    break;
                case 2:
                    for (Aluno aluno : alunos) {
                        if (aluno instanceof AlunoGraduacao) {
                            AlunoGraduacao ag = (AlunoGraduacao) aluno;
                            System.out.println(ag.toString()+ "\n");
                        } else if (aluno instanceof AlunoPosGraduacao) {
                            AlunoPosGraduacao apg = (AlunoPosGraduacao) aluno;
                            System.out.println(apg.toString() + "\n");

                        }

                    }
                    break;
                case 3:
                    System.out.println("Obrigado até a proxima");
                    break;
            }

        }
    }
}
