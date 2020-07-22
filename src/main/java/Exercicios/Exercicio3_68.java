package Exercicios;

import static java.lang.String.format;

public class Exercicio3_68 {
    public String name;
    public double nota1, nota2, nota3, finalGrade;

    public void grade(){
        finalGrade = nota1 + nota2 + nota3;
        System.out.println("FINAL GRADE = " + String.format("%.2f",finalGrade));
        if(finalGrade >= 60){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", (60 - finalGrade)) + " POINTS");
        }
    }
}
