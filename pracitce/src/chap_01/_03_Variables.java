package chap_01;

import java.sql.SQLOutput;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        int age = 17;
        char type = 'O';
        name = "박미리";
                System.out.println(name + "님 " + age + "세 " + type + "형");

        int a = 20;
        int b = 4;
        System.out.println(a/b);

        boolean i = true;
        System.out.println("박미리는 컴시일 시험 공부를 했을까요?" + i);
        long j = 1000000000000000000L;
        float n = 3.1415926535F;
        System.out.println(j);
        System.out.println(n);
    }
}
