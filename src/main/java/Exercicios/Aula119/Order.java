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

}
