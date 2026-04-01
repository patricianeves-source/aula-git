import java.util.Scanner;

public class ex10 {
    static void main() {

        Scanner sc = new Scanner (System.in);
         int total = 300;

        IO.println("quantas páginas você leu hoje?");

        int paginas = sc.nextInt();

        int falta = total - paginas;
        IO.println("Faltam " + falta +" paginas");
    }
}
