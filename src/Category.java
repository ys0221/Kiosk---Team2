import java.util.ArrayList;

public class Category {
    private int categoryNumber; // 카테고리 번호
    private String name;
    private ArrayList<Product> products;

    public Category(int categoryNumber, String name) {
        this.categoryNumber = categoryNumber;
        this.name = name;
        this.products = new ArrayList<>();
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void print() {
        System.out.println(categoryNumber + ". " + name);
    }
}
