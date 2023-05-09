package kr.ac.sahmyook.home.func.kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    public void maxNumber() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        }
    }

    ;

    public void minNumber() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println(a);
        } else if (a > b) {
            System.out.println(b);
        }
    }

    ;

    public void threeMaxMin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값：");
        int a = sc.nextInt();
        System.out.print("b의 값：");
        int b = sc.nextInt();
        System.out.print("c의 값：");
        int c = sc.nextInt();
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("최댓값은 " + max + "입니다.");
        System.out.println("최솟값은 " + min + "입니다.");
    }

    ;

    public void checkEven() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }

    ;

    public void isPassFail() {
        Scanner sc = new Scanner(System.in);
        int Korean = sc.nextInt();
        int English = sc.nextInt();
        int math = sc.nextInt();

        int sum = Korean + English + math;
        int avg = sum / 3;

        if (avg >= 70 && Korean > 60 && English > 60 && math > 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }

    ;

    public void scoreGrade() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score > 90) {
            System.out.println("A");
        } else if (score > 80) {
            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C");
        } else if (score > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    ;

    public void checkPlusminusZero() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("양수입니다.");
        } else if (a == 0) {
            System.out.println("0입니다.");
        } else if (a < 0) {
            System.out.println("음수입니다.");
        }
    }

    ;

    public void whatCaracter() {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = (int) a;
        if (b >= 65 || b <= 90) {
            System.out.println("대문자입니다.");
        } else if (b >= 97 || b <= 122) {
            System.out.println("소문자입니다.");
        }
    }

    ;


}
