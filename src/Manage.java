import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Manage {
    private List<String> requests;
    private List<Product> orderList;
    private double totalPrice = 0.0;
    private int numCustomers = 0;

    // 주문 목록 정보 받기
    public Manage(double price, List<String> requests, List<Product> waitList, int numCustomer) {
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
}

