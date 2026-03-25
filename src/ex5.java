import java.util.Scanner;

public class ex5 {

    static void main() {

        Scanner sc = new Scanner (System.in);

                int guardar, meta = 500;

        IO.println(" quanto você economizou? ");

        guardar = sc.nextInt();

        if (guardar >= meta) {

            IO.println(" você alcançou a sua meta ");

            IO.println(" você excedeu" + (guardar - meta) + " sua meta hoje ");

        }else {

            IO.println("Você não alcançou sua meta");

            IO.println("faltaram " + (meta - guardar) + " reais ");





        }
        }




    }


