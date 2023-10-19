
import java.util.Scanner;

public class Main {

    public static String classificacaoDoJogador(int saldo, String heroi) {
        if (saldo <= 10) {
            return "O Herói tem um saldo de " + saldo + " esta no FERRO\n"
                    + "para subir na proxima divisão é necessario ter mais "
                    + ((saldo - 11) * (-1)) + " de saldo";
        } else if (saldo >= 11 && saldo <= 20) {
            return "O Herói tem um saldo de " + saldo + " esta no BRONZE\n"
                    + "para subir na proxima divisão é necessario ter mais "
                    + ((saldo - 21) * (-1)) + " de saldo";
        } else if (saldo >= 21 && saldo <= 50) {
            return "O Herói tem um saldo de " + saldo + " esta no PRATA\n"
                    + "para subir na proxima divisão é necessario ter mais "
                    + ((saldo - 51) * (-1)) + " de saldo";
        } else if (saldo >= 51 && saldo <= 80) {
            return "O Herói tem um saldo de " + saldo + " esta no OURO\n"
                    + "para subir na proxima divisão é necessario ter mais "
                    + ((saldo - 81) * (-1)) + " de saldo";
        } else if (saldo >= 81 && saldo <= 90) {
            return "O Herói tem um saldo de " + saldo + " esta no DIAMANTE\n"
                    + "para subir na proxima divisão é necessario ter mais "
                    + ((saldo - 91) * (-1)) + " de saldo";
        } else if (saldo >= 91 && saldo <= 100) {
            return "O Herói tem um saldo de " + saldo + " esta no LENDÁRIO\n"
                    + "para subir na proxima divisão é necessario ter mais "
                    + ((saldo - 101) * (-1)) + " de saldo";
        } else if (saldo >= 101) {
            return "O Herói tem um saldo de " + saldo + " esta no IMORTAL\n"
                    + "Você está na divisão mais alta!!!";

        }
        return null;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String jogador;
        int vitorias;
        int derrotas;

        String continuar;

        do {
            System.out.println("Digite o nome do jogador");
            System.out.print(">> ");
            jogador = ler.nextLine();
            System.out.println("Digite número de vitórias");
            System.out.print(">> ");
            vitorias = Integer.parseInt(ler.nextLine());
            System.out.println("Digite número de derrotas");
            System.out.print(">> ");
            derrotas = Integer.parseInt(ler.nextLine());
            int saldo = vitorias - derrotas;
            System.out.println(classificacaoDoJogador(saldo, jogador));
            System.out.println("Deseja calcular de outro jogador? [s/n]");
            continuar = ler.nextLine();

        } while (continuar.equals("s") || continuar.equals("S"));

        ler.close();

    }

}
