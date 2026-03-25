import java.util.Scanner;

public class ex8 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int restrição, idade = 18;


        IO.println("Quantos anos você tem?");

        restrição = sc.nextInt();

        if (restrição >= idade) {

            IO.println("você pode entrar");

            IO.println("você tem" + (idade >= 18) + "de idade");

        }else{

            IO.println(" Você não pode entrar ");

            IO.println(" Você não tem" + (idade >= 18) + "  idade necessaria ");





        }

    }
















}
