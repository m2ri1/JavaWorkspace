package chap01;

public class Quiz_02_age {
    public static void main(String[] args) {
        String result;
        int age = 10;
        result = (age<20 ? "20살 이하이므로 술을 구매할 수 없습니다" : "술을 구매할 수 있습니다");
        System.out.println(result);
    }
}
