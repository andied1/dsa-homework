package week3;
import java.util.*;

public class OrderManager {
    private Vector<Order> orders;

    public OrderManager() {
        orders = new Vector<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order findOrder(String orderId) {
        for(Order o: orders) {
            if(o.getOrderId().equals(orderId)) {
                return o;
            }
        }
        return null;
    }

    public Vector<Order> getOrdersByStatus(String status) {
        Vector<Order> ordstat = new Vector<>();
        for(Order o: orders) {
            if(o.getOrderStatus().equals(status)) {
                ordstat.add(o);
            }
        }
        return ordstat;
    }

    public double getTotalRevenue() {
        double tot = 0;
        for(Order o: orders) {
            if(o.getOrderStatus().equalsIgnoreCase("Delivered")) {
            tot+=o.calculateTotal();
            }
        }
        return tot;
    }

    public void CancelOrder(String orderId) {
        for(Order o: orders) {
            if(o.getOrderId().equals(orderId)) {
                o.updateStatus("Canceled");
            }
        }
    }

    public void printAllOrders() {
        for(Order o : orders) {
            System.out.println("");
            o.printOrder();
        }
    }

    public Vector<Order> getPendingOrders() {
        return getOrdersByStatus("Pending");
    }

    public int getOrderCount() {
        return orders.size();
    }
}