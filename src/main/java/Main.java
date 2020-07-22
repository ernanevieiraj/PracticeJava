import Exercicios.Exercicio2_68;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Exercicio2_68 Employee = new Exercicio2_68();
        System.out.println("Name:");
        Employee.name = scanner.nextLine();
        System.out.println("Gross Salary:");
        Employee.grossSalary = scanner.nextDouble();
        System.out.println("Tax:");
        Employee.tax = scanner.nextDouble();
        System.out.println("Employee: " + Employee);
        System.out.println("Which percentage to increase salary?");
        Employee.increaseSalary(scanner.nextDouble());
        System.out.println("Updated data: " + Employee);
    }
}
