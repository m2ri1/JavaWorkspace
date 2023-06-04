import java.util.Scanner;

public class VendingMachineMain {
    public static void main(String[] args) {

    VendingMachine vm1 = new VendingMachine();//벤딩머신 객체 생성
    Scanner sc = new Scanner(System.in);// 스캐너 객체 생성
    int number = sc.nextInt();

    String product = vm1.pushButton(number);
    System.out.println(product + " 를 받으세요");
    }
}
