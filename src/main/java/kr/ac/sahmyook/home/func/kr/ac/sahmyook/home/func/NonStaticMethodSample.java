package kr.ac.sahmyook.home.func.kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
    public void testScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.println(num1);
        System.out.print("실수를 입력하세요: ");
        double num2 = scanner.nextDouble();
        System.out.println(num2);
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.next();
        System.out.println(str);

    }

    public void testRandom() {
        Random random = new Random();

        // 0~9 사이의 정수 난수 출력
        int randomInt = random.nextInt(10);
        System.out.println("정수 난수: " + randomInt);

        // 0.0~1.0 사이의 실수 난수 출력
        double randomDouble = random.nextDouble();
        System.out.println("실수 난수: " + randomDouble);
    }
}