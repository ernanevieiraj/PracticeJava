package Exercicios;


import java.util.Scanner;

public class ExercicioAula65 {
    public String name;
    public double price;
    public int quantity;

//    public ExercicioAula65(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return  name +
                ", $ " +
                String.format("%.2f", price) +
                ", "+
                quantity +
                " units, Total: $ "+
                String.format("%.2f", totalValueInStock());
    }

//    Scanner scanner = new Scanner(System.in);
//    ExercicioAula65 product = new ExercicioAula65();
//        System.out.println("Enter product data:");
//        System.out.println("Name:");
//    product.name = scanner.nextLine();
//        System.out.println("Price:");
//    product.price = scanner.nextDouble();
//        System.out.println("Quantity:");
//    product.quantity = scanner.nextInt();
//        System.out.println("Product data: " + product);
//        System.out.println("\nEnter the number of products to be added in stock:");
//        product.addProducts(scanner.nextInt());
//        System.out.printf("Updated data:" + product);
//        System.out.println("\nEnter the number of products to be removed from stock:");
//        product.removeProducts(scanner.nextInt());
//        System.out.printf("Updated data:" + product);

}
