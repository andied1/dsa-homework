package hw1;
import java.util.*;
import java.time.*;
public class Order {
    private String orderId;
    private String customerName;
    private String orderDate;
    private Vector<OrderItem> items = new Vector<>();
    private String orderStatus;

    public Order(String orderId, String customerName, String orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.items = new Vector<>();
        this.orderStatus = "Pending";
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public boolean removeItem(String productId) {
        for(OrderItem i: items) {
            if (i.getId().equals(productId)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public OrderItem findItem(String productId) {
        for(OrderItem i: items) {
            if (i.getId().equals(productId)) {
                return i;
            }
        }
        return null;
    }

    public double calculateTotal() {
    double total = 0;
        for(OrderItem i: items) {
            total += i.getUnitPrice() * i.getQuant();
        }
        return total;
    }

    public int getTotalItems() {
        int totquant = 0;
        for(OrderItem i: items) {
            totquant += i.getQuant();
        }
        return totquant;
    }

    public void updateStatus(String newStatus) {
        orderStatus = newStatus;
    }

    public void printOrder() {
        System.out.println("Order ID   Customer Name   Order Date     Order Status");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-12s%n", orderId, customerName, LocalDate.now(), orderStatus);
    }

    public Vector<OrderItem> getItems() {
        return new Vector<>(items);
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    @Override
    public String toString() {
        return orderId + " " + customerName + " " + orderDate;
    }
    
    }

