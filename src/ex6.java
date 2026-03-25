import java.util.Scanner;

public class ex6 {

    static void main() {
        Scanner sc = new Scanner (System.in);

        int estudar, meta = 40;
        IO.println(" quantas horas você estudou hoje? ");

        estudar = sc.nextInt();

        if (estudar >= meta) {

            IO.println(" você alcançou sua meta de estudos ");

            IO.println("você excedeu" + (estudar - meta) + "sua meta de estudos");

        }else {

            IO.println("você não alcançou sua meta de estudos");

            IO.println("faltaram " + (meta - estudar) + " horas ");








        }
    }


















}
