package week3;

import java.util.Vector;

public class ProductInventory {

    private Vector<Product> products = new Vector<>();


    public void addProduct(Product product) {
        for(Product p: products) {
            if (p.getId() == product.getId()) {
                System.out.println(product.getName() + " already exists.");
                break;
            }
            products.add(product);
        }
        }

    public boolean removeProduct(String productId) {
        for(Product p: products) {
            if (p.getId() == productId) {
                products.remove(p);
                return true;
            }
        }
        return false;
    }

    public Product findProduct(String productId) {
        for(Product p: products) {
            if (p.getId() == productId) {
                return p;
            }
        }
        return null;
    }

    

}