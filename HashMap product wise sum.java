import java.util.*;

public class ProductWiseSum {
    public static void main(String[] args) {
        // Input: might have duplicate products
        List<Product> transactions = Arrays.asList(
            new Product("Apple", 10),
            new Product("Banana", 5),
            new Product("Apple", 20),
            new Product("Orange", 15),
            new Product("Banana", 10)
        );
        
        // HashMap to store product -> total sum
        Map<String, Integer> productSum = new HashMap<>();
        
        // Loop and sum
        for (Product p : transactions) {
            productSum.merge(p.name, p.qty, Integer::sum);
        }
        
        // Print result
        System.out.println("Product wise sum:");
        productSum.forEach((product, total) -> 
            System.out.println(product + " : " + total)
        );
    }
    
    static class Product {
        String name;
        int qty;
        
        Product(String name, int qty) {
            this.name = name;
            this.qty = qty;
        }
    }
}