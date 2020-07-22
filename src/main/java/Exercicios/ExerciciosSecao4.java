package Exercicios;

import java.util.Scanner;

public class ExerciciosSecao4 {

    public void soma(){
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        a = a + b;
        System.out.println("SOMA: " + a);
        scanner.close();
    }

}
