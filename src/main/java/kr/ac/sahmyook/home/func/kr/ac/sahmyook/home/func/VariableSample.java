package kr.ac.sahmyook.home.func.kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myProfile() {
        String name = "고동환";
        int age = 26;
        String colleague = "삼육대학교";
        System.out.println(name + age + colleague);
    }

    public void empInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요.");
        String name = sc.next();
        System.out.println("나이를 입력해주세요.");
        int age = sc.nextInt();
        System.out.println("부서를 입력해주세요.");
        String section = sc.next();
        System.out.println("이름:" + name + "\n" +
                "나이:" + age + "\n" +
                "부서:" + section + "\n");
    }
}
