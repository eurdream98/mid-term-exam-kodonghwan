package kr.ac.sahmyook.home.func.kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {
    public void calculator() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);

        if (c == '+') {
            System.out.println(a + b);
        } else if (c == '-') {
            System.out.println(a - b);

        } else if (c == '*') {
            System.out.println(a * b);
        } else if (c == '/') {
            System.out.println(a / b);
        } else if (c == '%') {
            System.out.println(a % b);
        }
    }

    ;

    public void fruitPrice() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a.equals("사과")) {
            System.out.println("2000원");
        } else if (a.equals("배")) {
            System.out.println("3000원");
        } else if (a.equals("바나나")) {
            System.out.println("5000원");
        }
    }

    ;

}
