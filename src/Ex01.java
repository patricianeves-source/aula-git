import java.util.Scanner;

public class Ex01 {

    static void main() {

    Scanner sc = new Scanner(System.in);

        IO.println("Cadastro de aluno");


        IO.println("nome do aluno");
        String nome = sc.nextLine();

        IO.println("Em qual curso você está matrículado?");
        String curso = sc.nextLine();


        IO.println("qual é a sua idade?");
        int idade = sc.nextInt();


        IO.println(" Informações do aluno ");

        IO.println("Curso do aluno " + curso );


        IO.println(" nome do aluno " + nome );


        IO.println("idade do aluno " + idade );

    }





}
