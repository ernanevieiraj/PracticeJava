import Exercicios.Exercicio2_68;
import Exercicios.Exercicio3_68;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Exercicio3_68 student = new Exercicio3_68();
        System.out.println("Name: ");
        student.name = scanner.nextLine();
        System.out.println("Nota 1: ");
        student.nota1 = scanner.nextDouble();
        System.out.println("Nota 2: ");
        student.nota2 = scanner.nextDouble();
        System.out.println("Nota 3: ");
        student.nota3 = scanner.nextDouble();
        student.grade();

    }
}
