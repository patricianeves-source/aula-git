import java.util.Scanner;

public class ex9 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int frete, gratis = 100;

        IO.println(" qual o valor da compra");

        gratis = sc.nextInt();

        if (gratis > 100) {

            IO.println("Você conseguiu frete gratis");

        }else{

            if (gratis < 100)

                IO.println("sem frete gratis");
            IO.println("adicione mais produtos para dar o valor necessario");




        }











    }
}
