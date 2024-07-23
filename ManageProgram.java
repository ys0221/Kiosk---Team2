package OrderProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageProgram {
    private ArrayList<Category> categories = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public ManageProgram() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(String name) {
        // 카테고리 번호를 입력받습니다.
        System.out.print("새로운 카테고리 번호를 입력하세요: ");
        int categoryNumber = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        // 입력받은 번호로 Category 객체 생성
        categories.add(new Category(categoryNumber, name));
        System.out.println("카테고리가 추가되었습니다.");
    }

    public void deleteCategory(int categoryNumber) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getCategoryNumber() == categoryNumber) {
                categories.remove(i);
                System.out.println("카테고리가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 카테고리가 존재하지 않습니다.");
    }

    public void addProduct(String name, String description, double price, int categoryNumber) {
        for (Category category : categories) {
            if (category.getCategoryNumber() == categoryNumber) {
                int productNumber = category.getProducts().size() + 1; // 다음 상품 번호 할당
                category.addProduct(new Product(productNumber, name, description, price));
                System.out.println("상품이 추가되었습니다.");
                return;
            }
        }
        System.out.println("해당 카테고리가 존재하지 않습니다.");
    }

    public void deleteProduct(int categoryNumber, int productNumber) {
        for (Category category : categories) {
            if (category.getCategoryNumber() == categoryNumber) {
                for (int i = 0; i < category.getProducts().size(); i++) {
                    if (category.getProducts().get(i).getProductNumber() == productNumber) {
                        category.removeProduct(category.getProducts().get(i));
                        System.out.println("상품이 삭제되었습니다.");
                        return;
                    }
                }
            }
        }
        System.out.println("해당 상품이 존재하지 않습니다.");
    }

    public Category getCategory(int categoryNumber) {
        for (Category category : categories) {
            if (category.getCategoryNumber() == categoryNumber) {
                return category;
            }
        }
        System.out.println("해당 카테고리가 존재하지 않습니다.");
        return null;
    }
}