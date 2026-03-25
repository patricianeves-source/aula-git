import java.util.Scanner;

public class ex7 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int nota, aprovado = 7;

        IO.println("Qual é a sua nota final?");

       nota = sc.nextInt();

       if (nota >= aprovado) {

           IO.println(" Você foi aprovado! ");

           IO.println("Você atingiu " + (nota - aprovado) + "sua nota ");

       }else{

           IO.println("Você foi reprovado!");

           IO.println("Você não atingiu" + (nota - aprovado) + "a nota");





       }











    }















}
