package Exercicios;

public class Exercicio2_68 {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentIncreaseSalary){
        grossSalary = grossSalary+((grossSalary*percentIncreaseSalary)/100);
    }

    public String toString(){
        return  name
                + ", $ "
                + String.format("%.2f",grossSalary-tax);
    }

//    Exercicio2_68 Employee = new Exercicio2_68();
//        System.out.println("Name:");
//    Employee.name = scanner.nextLine();
//        System.out.println("Gross Salary:");
//    Employee.grossSalary = scanner.nextDouble();
//        System.out.println("Tax:");
//    Employee.tax = scanner.nextDouble();
//        System.out.println("Employee: " + Employee);
//        System.out.println("Which percentage to increase salary?");
//        Employee.increaseSalary(scanner.nextDouble());
//        System.out.println("Updated data: " + Employee);
}
