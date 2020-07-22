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
}
