import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Product> orderList = new ArrayList<>();
    private List<String> requests = new ArrayList<>();
    private double totalPrice = 0;
    private int count;
    private static int num_customer = 1; // 모든 인스턴스가 공유할 수 있도록 해줘야함 -> 상태 변경이 되지 않게 해준다


    public Order() {
        count = 0;
        totalPrice = 0;
    }

    public int getCount() {
        count++;
        return count;
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

    public List<String> getRequests() {
        return this.requests;
    }

    public void selectOrder(int num) {
        if (num == 1) {
            System.out.println("주문 요청사항을 입력해주세요");
            Scanner scanner = new Scanner(System.in);
            String request = scanner.nextLine();
            if (request.length() > 20) {
                System.out.println("입력 가능한 글자 수를 초과하였습니다. 다시 입력해주세요");
            } else {
                requests.add(request);
                System.out.println("주문이 완료되었습니다!");
                System.out.println("대기번호는 [ " + num_customer + " ] 번 입니다.");
                num_customer++;
            }
        } else if (num == 2) {
            // 메뉴판으로 돌아간다
        } else {
            System.out.println("Invalid order");
            // 메뉴판으로 돌아간다.
        }
    }

    public void cancelOrder(){
        orderList.clear();
        totalPrice = 0;
    }
}

