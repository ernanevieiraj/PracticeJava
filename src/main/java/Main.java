
import Exercicios.Aula119Fixacao.OrderItem;
import Exercicios.Aula128.Employee;
import Exercicios.Aula128.OutsorcedEmployee;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employee = new ArrayList<>();
        System.out.println("Digite a quantidade de funcionarios: ");
        int qttEmployees = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < qttEmployees; i++){
            System.out.print("Digite o nome do empregado: ");
            String employeeName = scanner.nextLine();
            System.out.print("Digite as horas do empregado: ");
            int employeeHours = scanner.nextInt();
            System.out.print("Digite o valor por horas do empregado: ");
            Double employeeHoursValue = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("O empregado e terceirizado(y/n)? ");
            String terceirizado = scanner.next();
            if (terceirizado.equals("y")){
                System.out.print("Digite a despesa adicional do funcionario:  ");
                Double additionalCharge = scanner.nextDouble();
                employee = (List<Employee>) new OutsorcedEmployee(employeeName, employeeHours, employeeHoursValue, additionalCharge);
            }
            if (terceirizado.equals("n")){
                employee = (List<Employee>) new Employee (employeeName,employeeHours,employeeHoursValue);
            }
        }
        scanner.close();
    }
}
