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
//    Exercicio3_68 student = new Exercicio3_68();
//        System.out.println("Name: ");
//    student.name = scanner.nextLine();
//        System.out.println("Nota 1: ");
//    student.nota1 = scanner.nextDouble();
//        System.out.println("Nota 2: ");
//    student.nota2 = scanner.nextDouble();
//        System.out.println("Nota 3: ");
//    student.nota3 = scanner.nextDouble();
//        student.grade();

}
