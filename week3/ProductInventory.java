package week3;
import java.util.*;

public class ProductInventory {

    private Vector<Product> products = new Vector<>();


    public void addProduct(Product product) {
        for(Product p: products) {
            if (p.getId().equals(product.getId())) {
                System.out.println(product.getName() + " already exists.");
                return;
            }
            products.add(product);
        }
        }

    public boolean removeProduct(String productId) {
        for(Product p: products) {
            if (p.getId().equals(productId)) {
                products.remove(p);
                return true;
            }
        }
        return false;
    }

    public Product findProduct(String productId) {
        for(Product p: products) {
            if (p.getId().equals(productId)) {
                return p;
            }
        }
        return null;
    }

    public Vector<Product> getProductsByCategory(String category) {
        Vector<Product> newcate = new Vector<>();
        for(Product p: products) {
            if (p.getCategory().equalsIgnoreCase(category)) {
                newcate.add(p);
            }
        }
        return newcate;
    }

    public Vector<Product> getLowStockProducts(int threshold) {
        Vector<Product> low = new Vector<>();
        for(Product p: products) {
            if (p.getQuant() < threshold) {
                low.add(p);
            }
        }
        return low;
    }

    public double getTotalInventoryValue() {
        double total = 0;
        for(Product p: products) {
            total += p.getPrice() * p.getQuant();
        }
        return total;
    }

    public void updateStock(String productId, int quantityChange) {
        for(Product p: products) {
            if (p.getId().equals(productId)) {
                p.setQuant(p.getQuant() + quantityChange);
            }
        }
    }

    public void printAllProducts() {
        System.out.println("Product ID   Product Name   Category   Price   Quantity   Supplier");
        System.out.println("------------------------------");

        for(Product p: products) {
            System.out.printf("%3s %3s %3s %3f %3d %3s", p.getId(),p.getName(),p.getCategory(),p.getPrice(),p.getQuant(),p.getSupp());
        }
    }

    public int getTotalProducts() {
        return products.size();
    }

    public void printCapacityInfo() {
        System.out.println("Size: " + products.size());
        System.out.println("Capacity: " + products.capacity());
    }

}