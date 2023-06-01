public class p1 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));
        System.out.println(s2.equalsIgnoreCase("python"));

        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2));//true (내용)
        System.out.println(s1 == s2);//true (참조)


        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s2);//false

    }
}
