import java.util.Scanner;

public class tabuada {

    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("digite um número para somar");
        int numMax = sc.nextInt();

        int soma = 0;
        int contador = 1;

        String sequencia = "";

        while (contador <= numMax) {

            soma = soma + contador;

            if (contador == 1)

                sequencia = "" + contador;

            sequencia = sequencia + "+" + contador;

            IO.println("Resultado final: A soma de 1 até " + numMax + " é " + soma);
        }
    }
}


