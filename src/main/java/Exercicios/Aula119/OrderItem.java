package Exercicios.Aula119;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private Double price;
    private int quantity;
    private Product product;

    public OrderItem( Double price, int quantity, Product product ) {
        this.price = price;
        this.quantity = quantity;
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice( Double price ) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity( Integer quantity ) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct( Product product ) {
        this.product = product;
    }

    public Double subTotal(){
        return quantity*price;
    }

    public String toString(){
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }


}
