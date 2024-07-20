import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Menu> menu = new ArrayList<>();
        List<List<Product>> orderList = new ArrayList<>();
        List<String> requirements;
        List<Double> totalOrderPrice = new ArrayList<>();
        ArrayList<String> orderRequests = new ArrayList<>();
        Order order = new Order();
        int numCustomer = 1;
        ArrayList<Manage> manageList = new ArrayList<>();

        List<Product> pastaList = new ArrayList<>();
        pastaList.add(new Product("오일 파스타", "올리브유에 마늘의 풍부한 향을 더한 파스타", 6.9));
        pastaList.add(new Product("토마토 파스타", "치즈를 듬뿍 갈아 올린 베이직 토마토 파스타", 7.9));
        pastaList.add(new Product("크림 파스타", "고소한 크림 소스가 별미인 파스타", 7.9));
        menu.add(new Menu("Pasta", "롤링 파스타의 대표 메뉴 파스타", pastaList));

        List<Product> pizzaList = new ArrayList<>();
        pizzaList.add(new Product("고르곤졸라", "고르곤졸라 치즈로 만든 피자에 달콤한 꿀까지", 8.5));
        pizzaList.add(new Product("마르게리따", "토마토 소스 베이스의 담백한 맛", 8.5));
        menu.add(new Menu("Pizza", "파스타와 함께 먹으면 맛있는 피자", pizzaList));

        List<Product> gnocchList = new ArrayList<>();
        gnocchList.add(new Product("버섯뇨끼", "뇨끼와 버섯 그리고 크림소스가 입안에서 살살 녹아요", 6.3));
        gnocchList.add(new Product("단호박뇨끼", "달콤한 단호박과 부드러운 크림의 조화", 6.3));
        menu.add(new Menu("Gnocch", "쫀득쫀득 맛있는 뇨끼", gnocchList));

        List<Product> pilafList = new ArrayList<>();
        pilafList.add(new Product("불고기 필라프", "불맛나는 불고기를 맛있게 볶은 필라프", 7.0));
        pilafList.add(new Product("스테이크 필라프", "두툼한 스테이크의 식감을 느껴보세요", 7.5));
        menu.add(new Menu("Pilaf", "밥이 땡길 때는 필라프", pilafList));

        List<Product> drinkList = new ArrayList<>();
        drinkList.add(new Product("콜라", "일상 속 마법 같은 짜릿한 순간", 2.0));
        drinkList.add(new Product("제로콜라", "당분 제로의 다이어트 콜라", 2.0));
        drinkList.add(new Product("에이드", "수제 과일청으로 만든 여름철 별미", 3.0));
        menu.add(new Menu("Drink", "목 마를 때 마실 수 있는 시원한 음료", drinkList));

        // 메뉴판에서 가시성 있게 수정 -> 메뉴판에서 6번 7번 삭제
        menu.add(new Menu("Order", "장바구니를 확인 후 주문합니다."));
        menu.add(new Menu("Cancel", "진행 중인 주문을 취소합니다."));

        while (true) {
            if (numCustomer > 1) {
                // 완료 목록 출력
                /*
                System.out.println("[ 완료된 주문 ]");
                for (int i = 0; i < manageList.size(); i++) {
                    manageList.get(i).printNumber(); // 대기 번호
                    manageList.get(i).printOrder(); // 주문 상품 목록
                    manageList.get(i).printTotalPrice(); // 상품 총 가격
                    manageList.get(i).printRequests(); // 요청 사항
                    manageList.get(i).printTime(); // 주문 일시
                    manageList.get(i).printCompleteTime(); // 완료 일시
                    System.out.println("-------------------------------------");
                }

                 */
                // 대기 목록 출력
                System.out.println("[ 대기 주문 ]");
                // 대기 목록 출력 -> 인덱스 포함
                for (int i = 0; i < manageList.size(); i++) {
                    manageList.get(i).printNumber(); // 대기 번호
                    manageList.get(i).printOrder(); // 주문 상품 목록
                    manageList.get(i).printTotalPrice(); // 상품 총 가격
                    manageList.get(i).printRequests(); // 요청 사항
                    manageList.get(i).printTime(); // 주문 일시
                    System.out.println("-------------------------------------");
                }
            }


            System.out.println("===== 메인 메뉴판 =====");
            System.out.println("주문하실거면 order 를, 주문을 취소하실거면 cancel 을 입력해주세요");
            for (int i = 0; i < menu.size()-2; i++) {
                System.out.println(i + 1 + "." + menu.get(i).getTitle() + " | " + menu.get(i).getDescription());
            }
            for (int j = menu.size()-2 ; j < menu.size(); j++) {
                System.out.println(menu.get(j).getTitle() + " | " + menu.get(j).getDescription());
            }

            System.out.print("원하는 항목을 선택하세요: ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    menu.get(0).print();
                    menu.get(0).addOrder(order, scanner);
                    break;
                case "2":
                    menu.get(1).print();
                    menu.get(1).addOrder(order, scanner);
                    break;
                case "3":
                    menu.get(2).print();
                    menu.get(2).addOrder(order, scanner);
                    break;
                case "4":
                    menu.get(3).print();
                    menu.get(3).addOrder(order, scanner);
                    break;
                case "5":
                    menu.get(4).print();
                    menu.get(4).addOrder(order, scanner);
                    break;
                case "6":
                    // 상품 추가
                    break;
                case "7":
                    //
                    break;
                case "8":
                    //
                    break;
                case "9":
                    //
                    break;
                case "10":
                    //
                    break;
                case "11":
                    //
                    break;
                case "12":
                    //
                    break;
                case "13":
                    //
                    break;
                case "14":
                    //
                    break;
                case "15":
                    //
                    break;
                case "order":
                    order.print();
                    Scanner select = new Scanner(System.in);
                    order.selectOrder(select.nextInt());
                    // 주문 목록 저장
                    Manage manage = new Manage(order.getTotalPrice(), order.getRequests(), order.getOrderList(), numCustomer);
                    manageList.add(manage);
                    numCustomer++;
                    // order 초기화-> order 초기화 해주는 이유 찾기
                    order = new Order();
                    break;
                case "cancel":
                    // 주문 취소 창 출력
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}


