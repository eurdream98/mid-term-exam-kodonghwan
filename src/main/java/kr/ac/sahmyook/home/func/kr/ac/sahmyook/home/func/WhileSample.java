package kr.ac.sahmyook.home.func.kr.ac.sahmyook.home.func;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class WhileSample {
    public void printUniCode() {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        while (a != '0') {

            System.out.println((int) a);
        }
    }

    ;

    public void sum1To100() {
        int i = 1;
        int sum = 0;
        while (i < 101) {
            sum += i;
            i++;
        }

    }

    ;

    public void numberGame() {
        Scanner sc = new Scanner(System.in);


        boolean game = true;

        while (game) {
            System.out.println("Up & Down 게임입니다. 정답을 맞혀보세요. 기회는 5번입니다.");
            Random r = new Random();
            int k = r.nextInt(100); // 0~99까지의 임의의 정수 생성
            int n = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print(i + ">>");

                try {
                    n = sc.nextInt(); // 숫자 입력

                    if (n < 0 || n > 99) {
                        System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                        i--;
                        continue;
                    }

                    if (n == k) // 정답 시
                    {
                        System.out.println("축하드립니다 정답입니다.");
                        break;
                    } else if (n < k) // Up
                    {
                        System.out.println("Up");
                    } else //(n > k) Down
                    {
                        System.out.println("Down");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                    sc.next();
                    i--;
                    continue;
                }
            }

            if (n != k) {
                System.out.println("아쉽습니다. 5회안으로 맞히지 못하였습니다.");
                System.out.println("정답은 " + k + " 였습니다.");
            }

            System.out.println("다시하시겠습니까?(y/n)");
            if (sc.next().equals("n")) {
                game = false;
                break;
            }
        }
        System.out.println("게임이 종료되었습니다.");

    }

    ;

    public void countCharacter() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a.length());
    }

    ;

    public void countInChar(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
            System.out.println(count);
        }
    }

    ;
}
