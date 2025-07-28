package U1.L3;

public class Product {
    int quality;
    String name;
    public Product(int quality, String name) {
        this.quality = quality;
        this.name = name;
    }
    public boolean checkQuality() {
        if (quality >= 5) {
            return true;
        } else {
            return false;
        }
    }
}