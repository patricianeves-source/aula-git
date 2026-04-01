import java.util.Scanner;

public class ex11 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double TamanhoTotal = 2.0;

        IO.println("digite quanto ja foi baixado (em GB): ");

        double baixado = sc.nextDouble();

        if (baixado < 0) {

            IO.println("Erro: o valor baixado não pode ser negativo.");

        } else if (baixado > TamanhoTotal) {

            IO.println(" o valor baixado não pode ser maior que o tamanho total ");

        } else {

            double percentual = (baixado / TamanhoTotal) * 100;

            IO.println(" Progresso do dowload: 2% concluído");


        }
    }
}


















