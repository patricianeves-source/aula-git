import java.util.Scanner;

public class ex3 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println(" Plataforma do jogo ");

        IO.println("nome do jogador");

        String nickname = sc.nextLine();

        IO.println("Jogo favorito");

        String jogo = sc.nextLine();

        IO.println("pontuação atual");

        int pontos = sc.nextInt();

        IO.println(" perfil do jogador");

        IO.println("nome do jogador " + nickname );

        IO.println("jogo favorito " + jogo );

        IO.println("pontuação atual " + pontos );










    }

}
