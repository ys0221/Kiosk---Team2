package OrderProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Adddelete {
    private static void adminMode(ArrayList<Category> categories, ManageProgram manageProgram, Scanner scan) {
        while (true) {
            System.out.println("===== 관리자 모드 =====");
            System.out.println("1. 카테고리 추가");
            System.out.println("2. 카테고리 삭제");
            System.out.println("3. 상품 추가");
            System.out.println("4. 상품 삭제");
            System.out.println("5. 메뉴판으로 돌아가기");
            System.out.print("원하는 항목을 선택하세요: ");
            int adminChoice = scan.nextInt();

            switch (adminChoice) {
                case 1:
                    System.out.print("추가할 카테고리 이름을 입력하세요: ");
                    scan.nextLine(); // Consume the newline
                    String categoryName = scan.nextLine();
                    manageProgram.addCategory(categoryName);
                    // 메뉴를 다시 출력
                    printMenu(categories);
                    break;
                case 2:
                    System.out.print("삭제할 카테고리 번호를 입력하세요: ");
                    int categoryNumberToDelete = scan.nextInt();
                    manageProgram.deleteCategory(categoryNumberToDelete);
                    // 메뉴를 다시 출력
                    printMenu(categories);
                    break;
                case 3:
                    System.out.print("상품을 추가할 카테고리 번호를 입력하세요: ");
                    int categoryNumber = scan.nextInt();
                    System.out.print("상품 이름을 입력하세요: ");
                    scan.nextLine(); // Consume the newline
                    String productName = scan.nextLine();
                    System.out.print("상품 설명을 입력하세요: ");
                    String productDescription = scan.nextLine();
                    System.out.print("상품 가격을 입력하세요: ");
                    double productPrice = scan.nextDouble();
                    manageProgram.addProduct(productName, productDescription, productPrice, categoryNumber);
                    // 메뉴를 다시 출력
                    printMenu(categories);
                    break;
                case 4:
                    System.out.print("상품을 삭제할 카테고리 번호를 입력하세요: ");
                    categoryNumberToDelete = scan.nextInt();
                    System.out.print("상품 번호를 입력하세요: ");
                    int productNumberToDelete = scan.nextInt();
                    manageProgram.deleteProduct(categoryNumberToDelete, productNumberToDelete);
                    // 메뉴를 다시 출력
                    printMenu(categories);
                    break;
                case 5:
                    return; // 메뉴판으로 돌아가기
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
    private static void printMenu(ArrayList<Category> categories) {
        for (Category category : categories) {
            category.print(); // 카테고리와 상품을 출력
        }
    }

}
