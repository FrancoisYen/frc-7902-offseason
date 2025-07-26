package U1.L3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product fruits = new Product(7, "Fruit");
        Product vegetables = new Product(3, "Vegetables");
        Product eggs = new Product(8, "Eggs");
        Product meat = new Product(4, "Meat");
        Product bread = new Product(4, "Bread");
        Product[] products = {fruits, vegetables, eggs, meat, bread};
        ArrayList<Product> goodQuality = new ArrayList<>();
        for (Product product : products) {
            if (product.checkQuality(product)) {
                goodQuality.add(product);
            }
        }
        for (Product goodQualityProduct : goodQuality) {
            System.out.println("Product " + goodQualityProduct.name + " is of good quality.");
        }
    }
}
