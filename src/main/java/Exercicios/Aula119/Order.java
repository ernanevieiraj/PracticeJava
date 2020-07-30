package Exercicios.Aula119;

import Exercicios.Aula119.Enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order( Client client ) {
        this.client = client;
    }

    private Client client;
    private Date moment;

    public Order( Client client, Date moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    private OrderStatus status;
    private List<OrderItem> orderItem = new ArrayList<>();

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }


    public Date getMoment() {
        return moment;
    }

    public void setMoment( Date moment ) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus( OrderStatus status ) {
        this.status = status;
    }


    public Order() {
    }

    public void addItem(OrderItem item){
        orderItem.add(item);
    }

    public Double total(){
        double sum = 0;
        for(OrderItem item : orderItem){
            sum += item.subTotal();
        }
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItem) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

//            System.out.println("Enter cliente data: ");
//        System.out.print("Name: ");
//    String clientName = scanner.nextLine();
//        System.out.print("Email: ");
//    String email = scanner.nextLine();
//        System.out.print("Birth date (DD/MM/YYYY): ");
//    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//    Date birthDate = sdf1.parse(scanner.next());
//        System.out.println("Enter order data: ");
//        scanner.nextLine();
//        System.out.print("Status: ");
//    String statusOrder = scanner.nextLine();
//        System.out.print("How many items to this order: ");
//    int quantityProducts = scanner.nextInt();
//        scanner.nextLine();
//    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//    Date orderMoment = new Date();
//    Order order = new Order(new Client(clientName, email, birthDate), orderMoment, OrderStatus.valueOf(statusOrder));
//
//        for (int i=0; i< quantityProducts; i++){
//        System.out.println("Enter #" + (i+1) + " item data: ");
//        System.out.print("Product Name: ");
//        String productName = scanner.nextLine();
//        System.out.print("Product price: ");
//        Double productPrice = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Quantity: ");
//        int quantity = scanner.nextInt();
//        scanner.nextLine();
//        order.addItem( new OrderItem(productPrice, quantity, new Product(productName, productPrice)));
//    }
//        System.out.println("ORDER SUMMARY: ");
//        System.out.println(order);

}
