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
