import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Manage extends Order {
    private List<String> requests = new ArrayList<>();
    private List<Product> waitList = new ArrayList<>();
    private List<Double> total_price = new ArrayList<>();
    // 주문 목록 정보 받기
    public Manage(List<Double> price, List<String> list1, List<Product> list2) {
        this.total_price = price;
        this.requests = list1;
        this.waitList = list2;
    }

    public void update(List<Double> total_order_price, List<String> order_requests, List<Product> order_List) {
        this.total_price = total_order_price;
        this.requests = order_requests;
        this.waitList = order_List;
    }

    // 대기 번호 출력
    public void printNumber() {
        int number = waitingNumber();
        System.out.println("대기번호 : " + number);
    }

    // 주문 상품 목록 출력
    public void printOrder () {
        System.out.println("<주문 상품>");
        for (Product product : waitList) {
            product.print();
        }
    }

    // 상품 총 가격 출력
    public void printTotalPrice () {
        System.out.println("총 가격 : W " + total_price);
    }

    // 요청 사항 출력
    /*
    public void printRequests() {
        System.out.println("요청 사항:");
        List<String> lists = new ArrayList<>(requests); // requests 리스트를 복사하여 새로운 ArrayList 생성
        String join = String.join(", ", lists);
        System.out.println(join);
    }

     */

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
}

