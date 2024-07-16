import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Product> orderList = new ArrayList<>();
    private List<String> requests = new ArrayList<>();
    private List<Product> waitList = new ArrayList<>();
    private double totalPrice = 0;
    private int count;
    private int num_customer = 1;


    public Order() {
        count = 0;
        totalPrice = 0;
    }

    public int getCount() {
        count++;
        return count;
    }

    public List<Product> getWaitList() {
        return waitList;
    }

    public List<Product> getOrderList() {
        return orderList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void print() {
        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println("[ Orders ]");
        for (Product product : orderList) {
            product.print();
            totalPrice += product.getPrice();
        }
        System.out.println("[ Total ]");
        System.out.println("W " + totalPrice);

        System.out.println("1. 주문    2. 메뉴판");
    }

    public void addRequest(String request) {
        this.requests.add(request);
    }

    public List<String> getRequests() {
        return this.requests;
    }

    public void selectOrder(int num) {
        if (num == 1) {
            Scanner scanner = new Scanner(System.in);
            String request = scanner.nextLine();
            requests.add(request);
            System.out.println("주문이 완료되었습니다!");
            System.out.println("대기번호는 [ " + num_customer + " ] 번 입니다.");
            num_customer++;
        } else if (num == 2) {
            // 메뉴판으로 돌아간다
        } else {
            System.out.println("Invalid order");
            // 메뉴판으로 돌아간다.
        }
    }

    /*
    public List<String> getRequests() {
        return requests;
    }

     */

    public int waitingNumber() {
        return num_customer;
    }
}

