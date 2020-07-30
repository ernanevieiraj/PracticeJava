
import Exercicios.Aula119Fixacao.Client;
import Exercicios.Aula119Fixacao.Enums.OrderStatus;
import Exercicios.Aula119Fixacao.Order;
import Exercicios.Aula119Fixacao.OrderItem;
import Exercicios.Aula119Fixacao.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthday = sdf.parse(scanner.next());
        scanner.nextLine();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = scanner.nextLine();
        Date moment = new Date();
        Order order = new Order(moment, OrderStatus.valueOf(status), new Client(name, email, birthday));
        System.out.print("How many items to this order? ");
        int itemsOrder = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<itemsOrder; i++){
            System.out.print("Product name: ");
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            order.addItem(new OrderItem(quantity,productPrice, new Product(productName, productPrice)));
        }
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        scanner.close();
    }
}
