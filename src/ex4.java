import java.util.Scanner;

public class ex4 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int passos, meta = 1000;

        IO.println(" quantos passos você andou hoje? ");

        passos = sc.nextInt();

        if (passos >= meta) {

            IO.println("você alcançou sua meta de passos");

            IO.println("você excedeu " + (passos - meta) + "passos hoje.");
        }else {

            IO.println(" vc alcançou sua meta de passos");
            IO.println(" faltaram " + (meta - passos) + "passos hoje. ");



        }






















    }












}
