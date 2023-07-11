package chap02;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i, j;
        for ( i = 1 ; i<=a; i++) {
            for (j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}


