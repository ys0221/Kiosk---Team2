import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Menu> menu = new ArrayList<>();
        menu.add(new Menu("Pasta", "롤링 파스타의 대표 메뉴 파스타"));
        menu.add(new Menu("Pizza", "파스타와 함께 먹으면 맛있는 피자"));
        menu.add(new Menu("Gnocch", "쫀득쫀득 맛있는 뇨끼"));
        menu.add(new Menu("Pilaf", "밥이 땡길 때는 필라프"));
        menu.add(new Menu("Drink", "목 마를 때 마실 수 있는 시원한 음료"));
        menu.add(new Menu("Order", "장바구니를 확인 후 주문합니다."));
        menu.add(new Menu("Cancel", "진행 중인 주문을 취소합니다."));

        System.out.println("===== 메인 메뉴판 =====");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + 1 + "." + menu.get(i).getName() + " | " + menu.get(i).getDescription());
        }
        while(true) {
            System.out.print("원하는 항목을 선택하세요: ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // 파스타에 해당하는 상품 모두 나열
                    // 상품 번호 입력 받아서 해당 상품 주문
                    break;
                case "2" :
                    // 피자에 해당하는 상품 모두 나열
                    // 상품 번호 입력 받아서 해당 상품 주문
                    break;
                case "3" :
                    // 뇨끼에 해당하는 상품 모두 나열
                    // 상품 번호 입력 받아서 해당 상품 모두 주문
                    break;
                case "4" :
                    // 필라프에 해당하는 상품 모두 나열
                    // 상품 번호 입력 받아서 해당 상품 모두 주문
                    break;
                case "5" :
                    // 음료수에 해당하는 상품 모두 나열
                    // 상품 번호 입력 받아서 해당 상품 모두 주문
                    break;
                case "6" :
                    // 상품 추가
                    break;
                case "7" :
                    //
                    break;
                case "8" :
                    //
                    break;
                case "9" :
                    //
                    break;
                case "10" :
                    //
                    break;
                case "11" :
                    //
                    break;
                case "12" :
                    //
                    break;
                case "13" :
                    //
                    break;
                case "14" :
                    //
                    break;
                case "15" :
                    //
                    break;
                case "order" :
                    // 주문 창 출력
                    break;
                case "cancel" :
                    // 주문 취소 창 출력
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}



