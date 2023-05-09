package kr.ac.sahmyook.home.func.kr.ac.sahmyook.home.func;

public class BreakSample {
    public void sumBreak() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (i == 50) {
                break;
            }
        }
        System.out.println("1부터 50까지의 합: " + sum);
    }

    public void guguDanBreak() {
        outer: // outer라는 이름의 레이블을 지정
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 5 && j == 1) {
                    break outer; // outer 레이블이 붙은 반복문을 빠져나옴
                }
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
