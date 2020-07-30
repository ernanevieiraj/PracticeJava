package Exercicios.Aula119Fixacao;

import Exercicios.Aula119Fixacao.Enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order( Date moment, OrderStatus orderStatus, Client client ) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    private Date moment;
    private OrderStatus orderStatus;
    private List<OrderItem> orderItem = new ArrayList<>();
    private Client client;

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public Order( Date moment, OrderStatus orderStatus) {
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment( Date moment ) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus( OrderStatus orderStatus ) {
        this.orderStatus = orderStatus;
    }

    public void addItem(OrderItem item){
        orderItem.add(item);
    }

    public void removeItem(OrderItem item){
        orderItem.remove(item);
    }

    public double totalPriceOrder(){
        double sum = 0;
        for(OrderItem item: orderItem){
            sum+=  item.subTotal();
        }
        return sum;
    }

    public Client getClient() {
        return client;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(orderStatus).append("\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItem) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", totalPriceOrder()));
        return sb.toString();
    }
}
//    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println("Enter cliente data: ");
//                System.out.print("Name: ");
//                String name = scanner.nextLine();
//                System.out.print("Email: ");
//                String email = scanner.nextLine();
//                System.out.print("Birth date (DD/MM/YYYY): ");
//                Date birthday = sdf.parse(scanner.next());
//                scanner.nextLine();
//                System.out.println("Enter order data: ");
//                System.out.print("Status: ");
//                String status = scanner.nextLine();
//                Date moment = new Date();
//                Order order = new Order(moment, OrderStatus.valueOf(status), new Client(name, email, birthday));
//                System.out.print("How many items to this order? ");
//                int itemsOrder = scanner.nextInt();
//                scanner.nextLine();
//                for (int i=0; i<itemsOrder; i++){
//        System.out.print("Product name: ");
//        String productName = scanner.nextLine();
//        System.out.print("Product price: ");
//        double productPrice = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Quantity: ");
//        int quantity = scanner.nextInt();
//        scanner.nextLine();
//        order.addItem(new OrderItem(quantity,productPrice, new Product(productName, productPrice)));
//        }
//        System.out.println("ORDER SUMMARY: ");
//        System.out.println(order);
