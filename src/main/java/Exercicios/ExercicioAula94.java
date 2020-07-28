package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExercicioAula94 {

    private Integer id;
    private String name;
    private Double salary;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary( Double salary ) {
        this.salary = salary;
    }

    public ExercicioAula94( Integer id, String name, Double salary ) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void salaryIncrease(double percentage){
        salary = salary+((salary*percentage)/100);
    }

    public String toString(){

        return    id
                + ", "
                + name
                + ", "
                + String.format("%.2f",salary);

    }
//    List<ExercicioAula94> employee = new ArrayList<>();
//
//        System.out.print("How many employees will be registered? ");
//    int quantityEmployees = Integer.parseInt(scanner.nextLine());
//        for(int i = 0; i < quantityEmployees; i++){
//        System.out.print("Id: ");
//        Integer id = Integer.parseInt(scanner.nextLine());
//        System.out.print("Name: ");
//        String name = scanner.nextLine();
//        System.out.print("Salary: ");
//        Double salary = Double.parseDouble(scanner.nextLine());
//        employee.add(new ExercicioAula94(id, name, salary));
//    }
//        System.out.print("Enter the employee id that will have salary increase: ");
//    int id =scanner.nextInt();
//    ExercicioAula94 updateEmp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//        if (updateEmp == null){
//        System.out.print("This id does not exi3st");
//    }else {
//        System.out.print("Enter the porcentage: ");
//        Double percentage = scanner.nextDouble();
//        updateEmp.salaryIncrease(percentage);
//    }
//
//        for(ExercicioAula94 emplo : employee){
//        System.out.println(emplo.toString());
//    }
}
