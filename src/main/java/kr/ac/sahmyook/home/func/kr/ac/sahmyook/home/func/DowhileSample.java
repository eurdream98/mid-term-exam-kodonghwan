package kr.ac.sahmyook.home.func.kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DowhileSample {
    Scanner sc = new Scanner(System.in);

    public void addDashToken() {
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i < str.length() - 1) {
                System.out.print("-");
            }
        }
    }


    public void burgerKingMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.순살 버거:6500원");
        System.out.println("2.게살 버거:6000원");
        System.out.println("3.새우 버거:5500원");
        System.out.println("4.치킨 버거:7000원");
        int ch = 1;
        while (ch == 1) {

        }
    }

    ;

    public void isStringAlphabet() {
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();

        boolean isAllAlphabet = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                isAllAlphabet = false;
                break;
            }
        }

        if (isAllAlphabet) {
            System.out.println("모든 글자가 영문자입니다.");
        } else {
            System.out.println("영문자가 아닌 글자가 포함되어 있습니다.");
        }
    }

    ;

}
