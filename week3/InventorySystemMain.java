package week3;

import java.util.Vector;

public class InventorySystemMain {
    public static void main(String[] args) {
/* 
        //Creating product inventory, adding sample products and printing
        ProductInventory inventory = new ProductInventory();

        Product pro1 = new Product("P001", "Laptop", "Electronics", 999.99, 10, "TechCorp");
        Product pro2 = new Product("P002", "T-Shirt", "Clothing", 19.99, 50, "FashionInc");
        Product pro3 = new Product("P003", "Mouse", "Electronics", 29.99, 5, "TechCorp");

        inventory.addProduct(pro1);
        inventory.addProduct(pro2);
        inventory.addProduct(pro3);

        System.out.println("");
        
        //Before remove
        inventory.printAllProducts();


        inventory.removeProduct("P002");
        System.out.println("");

        System.out.println("Product Found: " + inventory.findProduct("P003"));
        System.out.println("");


        inventory.printAllProducts();
        System.out.println("");

        System.out.println("Products by electronics: " + inventory.getProductsByCategory("Electronics"));
        System.out.println("");
        System.out.println("Low Products: " + inventory.getLowStockProducts(11));
        System.out.println("");
        System.out.println("Total Invetory Value: " + inventory.getTotalInventoryValue());
        System.out.println("");
        System.out.println("Capacity Report"); inventory.printCapacityReport();
        */

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //Creating order manager, adding individual order items into an order
        OrderManager orderManager = new OrderManager();

        Order order1 = new Order("O001", "Alice", "2024-01-15");
        order1.addItem(new OrderItem("P001", "Laptop", 1, 999.99));
        order1.addItem(new OrderItem("P003", "Mouse", 2, 29.99));
        orderManager.addOrder(order1);

        Order order2 = new Order("O002", "John", "2025-01-15");
        order1.addItem(new OrderItem("P001", "hii", 1, 999.99));
        order1.addItem(new OrderItem("P003", "byee", 2, 29.99));
        orderManager.addOrder(order2);

        //Pending Status
        orderManager.printAllOrders();
        System.out.println("");

        System.out.println("Processing Order1...");
        order1.updateStatus("Delivered");
        //Delivered Status
        System.out.println("Order Updated");

        System.out.println("");
        System.out.println("Canceling Order2...");
        orderManager.CancelOrder("O002");
        System.out.println("Canceled Order2");

        orderManager.printAllOrders();

        System.out.println("");
        System.out.println("Total revenue: $" + orderManager.getTotalRevenue());
        System.out.println("");
        System.out.println("Finding Order O001: " + orderManager.findOrder("O001"));
        System.out.println("");
        System.out.println("Finding by Delivered Status: " + orderManager.getOrdersByStatus("Delivered"));      
        
        /* 
        GenericContainer<String> stringContainer = new GenericContainer<>();
        stringContainer.add("Hello");
        stringContainer.add("World");

        GenericContainer<Integer> intContainer = new GenericContainer<>();
        intContainer.add(10);
        intContainer.add(20);

        Vector<Integer> ints = new Vector<>();
        ints.add(10);
        ints.add(20);
        ints.add(30);
        //System.out.println("Sum: " + VectorUtils.sumNumbers(ints));  // 60.0
        //System.out.println("Average: " + VectorUtils.averageNumbers(ints));  // 20.0
        */

    }
}
