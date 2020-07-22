package Exercicios;

import java.util.Scanner;

public class Retangulo68 {
    public double width;
    public double height;

    public double area(){
        return height * width;
    }

    public double perimeter(){
        return 2 * (width+height);
    }

    public double diagonal(){
        return Math.sqrt(width * width + height * height);

    }

//    Scanner scanner = new Scanner(System.in);
//    Retangulo68 retangulo = new Retangulo68();
//        System.out.println("Enter rectangle width and height: ");
//    retangulo.width = scanner.nextDouble();
//    retangulo.height = scanner.nextDouble();
//        System.out.println("AREA = " + retangulo.area());
//        System.out.println("PERIMETER = " + retangulo.perimeter());
//        System.out.println("DIAGONAL = " + retangulo.diagonal());
}
