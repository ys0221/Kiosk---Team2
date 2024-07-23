// 2024.07.23 최종
public class Product {

    private String name;
    private String description;
    private double price;
    private int count = 0;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getCount() {
        return count;
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
        System.out.println(getName() + "\t\t| W " + getPrice() + " | " + getDescription());
    }

}
