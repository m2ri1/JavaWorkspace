package chap02;

public class _02_stringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));
        System.out.println(s1.equals("java"));// 문자열 내용이 같으면 ture, 다르면 false
        System.out.println(s1.equalsIgnoreCase("java"));

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
