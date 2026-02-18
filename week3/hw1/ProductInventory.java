package hw1;
import java.util.*;

public class ProductInventory {

    private Vector<Product> products = new Vector<>();


    public void addProduct(Product product) {
        for(Product p: products) {
            if (p.getId().equalsIgnoreCase(product.getId())) {
                System.out.println(product.getName() + " already exists.");
                return;
            }
        }
        products.add(product);

        }

    public boolean removeProduct(String productId) {
        Iterator<Product> pit = products.iterator();
        while(pit.hasNext()) {
            if(pit.next().getId().equalsIgnoreCase(productId)) {
                pit.remove();
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
        System.out.println("------------------------------------------------------------------");
        for(Product p: products) {
            System.out.printf("%-12s %-15s %-12s %-8.2f %-8d %-15s%n", p.getId(),p.getName(),p.getCategory(),p.getPrice(),p.getQuant(),p.getSupp());
        }
    }

    public int getTotalProducts() {
        return products.size();
    }

    public void printCapacityInfo() {
        System.out.println("Size: " + products.size());
        System.out.println("Capacity: " + products.capacity());
    }

    public void optimizeCapacity() {
        products.trimToSize();
    }

    public void ensureCapacity(int minCapacity) {
        products.ensureCapacity(minCapacity);
    }

    public void printCapacityReport() {
        System.out.println("Size: " + products.size());
        System.out.println("Capacity: " + products.capacity());
        System.out.println(products.size()%products.capacity() * 10 + "%");
        System.out.println(products.capacity() - products.size() + " space left");
    }

    public void printProductsUsingEnumeration() {
        Enumeration<Product> e = products.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
    //Enumeration is legacy because it existed before collections framework and is
    //basically replaced by the iterator. You should use enumeration when working with
    //legacy code.

}