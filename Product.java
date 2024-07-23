package OrderProgram;

public class Product {
    private int productNumber; // 상품 번호
    private String name;
    private String description;
    private double price;

    public Product(int productNumber, String name, String description, double price) {
        this.productNumber = productNumber;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println("   " + productNumber + ". " + name + " - " + description + " (W " + price + ")");
    }
}