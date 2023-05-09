package kr.ac.sahmyook.home.func.kr.ac.sahmyook.home.func;


public class StaticMethodSample {
    public void testMathRandom() {
        int randomNum = (int) (Math.random() * 45) + 1;
        System.out.println(randomNum);
    }

    public void testMathAbs() {
        double num = -12.77;
        double absNum = Math.abs(num);
        System.out.println(absNum);
    }

    public void testMathMax() {
        int num1 = 120;
        int num2 = 54;
        int maxNum = Math.max(num1, num2);
        System.out.println(maxNum);

    }
}
