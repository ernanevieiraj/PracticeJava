import Exercicios.ExercicioAula89;
import Exercicios.ExercicioAula94;
import Exercicios.ExercicioBancoAula80;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        List<ExercicioAula94> employee = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantityEmployees = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < quantityEmployees; i++){
            System.out.print("Id: ");
            Integer id = Integer.parseInt(scanner.nextLine());
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = Double.parseDouble(scanner.nextLine());
            employee.add(new ExercicioAula94(id, name, salary));
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int id =scanner.nextInt();
        ExercicioAula94 updateEmp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (updateEmp == null){
            System.out.print("This id does not exi3st");
        }else {
            System.out.print("Enter the porcentage: ");
            Double percentage = scanner.nextDouble();
            updateEmp.salaryIncrease(percentage);
        }

        for(ExercicioAula94 emplo : employee){
            System.out.println(emplo.toString());
        }
        scanner.close();

    }
}
