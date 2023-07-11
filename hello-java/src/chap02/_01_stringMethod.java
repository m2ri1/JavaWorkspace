package chap02;

public class _01_stringMethod {
    public static void main(String[] args) {
        String str = "my name is Miri Park is";
        //문자열 메소드
        //sout(변수이름 + 메소드)
        System.out.println(str);

        System.out.println(str.length());//문자열 길이

        System.out.println(str.toUpperCase());//대문자로 변경
        System.out.println(str.toLowerCase());//소문자로 변경

        System.out.println(str.contains("Miri"));//해당 문자열 포함 true
        System.out.println(str.contains("mirae"));//해당 문자열 포함X false
        System.out.println(str.indexOf("is"));//포함하는 경우 위치 반환
        System.out.println(str.indexOf("heh"));//포함하지 않을경우 -1

        System.out.println(str.indexOf("is"));//처음 일치하는 위치정보
        System.out.println(str.lastIndexOf("is"));//마지막으로 일치하는 위치정보

        System.out.println(str.startsWith("my name"));//문자열로 시작 여부
        System.out.println(str.endsWith("is"));//문자열로 끝나는지 여부

    }
}
