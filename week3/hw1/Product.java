package hw1;
import java.util.*;

public class Product {
    private String productId;
    private String name;
    private String category;
    private double price;
    private int quantityInStock;
    private String supplier;

    public Product(String productId, String name, String category, double price, int quantityInStock, String supplier) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.supplier = supplier;
        this.quantityInStock = quantityInStock;
        this.price = price;
    }

    public String getId() {
        return productId;
    }

    public void setId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    } 

    public int getQuant() {
        return quantityInStock;
    }

    public void setQuant(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getSupp() {
        return supplier;
    }

    public void setSupp(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return productId + " " + name + " " + category + " " + supplier + " " + quantityInStock +  " " + price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(productId == obj) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }



}
