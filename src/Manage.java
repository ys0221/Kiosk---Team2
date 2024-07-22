import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Manage {
    private List<String> requests;
    private List<Product> orderList;
    private double totalPrice;
    private int numCustomers;

    // 주문 목록 정보 받기
    public Manage(Double price, List<String> requests, List<Product> waitList, Integer numCustomer) {
        this.totalPrice = price;
        this.requests = requests;
        this.orderList = waitList;
        this.numCustomers = numCustomer;
    }

    // 대기 번호 출력
    public void printNumber() {
        System.out.println("대기번호 : " + numCustomers);
    }

    // 주문 상품 목록 출력
    public void printOrder () {
        System.out.println("<주문 상품>");
        for (Product product : orderList) {
            product.print();
        }
    }

    // 상품 총 가격 출력
    public void printTotalPrice () {
        System.out.println("총 가격 : W " + totalPrice);
    }

    // 요청 사항 출력
    public void printRequests () {
        System.out.println("요청 사항");
        for (String request : requests) {
            System.out.println(request);
        }
    }

    // 주문 시간 출력
    public void printTime () {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("주문 시간 : " + now);
    }

    // 주문 완료 시간 출력
    public void printCompleteTime() {
        LocalDateTime complete = LocalDateTime.now();
        System.out.println("완료 시간 : " + complete);
    }

    // 주문 상태 변경
    public void changeOrderStatus(ArrayList<Manage> List, int i, ArrayList<Manage> completeLists) {
        System.out.println(i+1 + " 의 주문 상태를 변경합니다.");
        System.out.println("조리가 완료되었으면 1번, 아니라면 2번을 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int next = scanner.nextInt();;
        if (next == 1) {
            completeLists.add(List.get(i));
            List.remove(i);
        } else if (next == 2) {
            // nothing
        } else {
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            next = scanner.nextInt();
        }
    }

    // 완료된 최근 주문 3개를 출력한다
    public void printCompleteOrder(ArrayList<Manage> completeLists) {
        if (completeLists.size() > 3) {
            completeLists.remove(completeLists.size()-3);
        } else {
            // nothing
        }
    }



}

