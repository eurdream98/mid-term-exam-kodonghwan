package kr.ac.sahmyook.home.func.kr.ac.sahmyook.home.func;

public class ContinueSample {
    public void sumJumpThree() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println("1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계: " + sum);
    }

    public void rowColJump() {
        int[][] arr = new int[][]{{1, 2, 0, 0, 0}, {3, 4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 && j >= 2 && j <= 4) {
                    continue;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
