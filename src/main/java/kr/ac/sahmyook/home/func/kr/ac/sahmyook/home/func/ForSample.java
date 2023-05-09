package kr.ac.sahmyook.home.func.kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    public void sum1To10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void sumEvenTO100() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public void oneGugudan() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }
    }

    public void sumMintToMax() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ch = 0;
        int sum = 0;
        if (a > b) {
            ch = a - b;
            for (int i = 0; i < (ch + 1); i++) {
                sum += a + i;
                System.out.println(sum);
            }
        } else if (a < b) {
            ch = b - a;
            for (int i = 0; i < (ch + 1); i++) {
                sum += b + i;
                System.out.println(sum);
            }
        }


    }

    public void printStar() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }

    }

    public void printNumberStar() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    System.out.println(i);
                } else {
                    System.out.println("*");
                }
            }
            System.out.println("\n");
        }

    }

    public void printTriangleStar() {
        Scanner input = new Scanner(System.in);
        System.out.println("삼각형의 크기");
        int size = input.nextInt();
        int i, j;

        for (i = 1; i <= size; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public void guguDan() {
        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

}
