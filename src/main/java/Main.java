import Exercicios.ExercicioBancoAula80;

import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        ExercicioBancoAula80 banco = new ExercicioBancoAula80();
        System.out.println("Enter account number: ");
        banco.setAccount(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter account holder: ");
        banco.setName(scanner.nextLine());
        System.out.println("Enter initial deposit value (y/n)?");
        if (scanner.next().equals("y")) {
            System.out.println("Enter initial deposit value: ");
            banco.addBalance(scanner.nextDouble());
        }
        System.out.println("Account data: " + banco);
        System.out.println("Enter a deposit value: ");
        banco.addBalance(scanner.nextDouble());
        System.out.println("Updated account data: " + banco);
        System.out.println("Enter a withdraw value: ");
        banco.removeBalance(scanner.nextDouble());
        System.out.println("Updated account data: " + banco);
        scanner.close();

    }
}
