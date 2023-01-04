package 스위치문Ex1;

// Switch문은 조건값에 따라 분기할 수 있으며, 조건값은 정수, 문자, 문자열이 올 수 있음 (C, C++에서는 문자열이 올 수 없음)

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ");
        String season = sc.next();
        switch (season) {
            case "spring" : // 해당 조건이 실행 됨
                System.out.println("꽃이 피는 봄이 왔어요^^");
                break; // 해당 조건을 종료
            case "summer" :
                System.out.println("무더운 여름입니다.");
                break;
            case "fall" :
            case "autunm" :
                System.out.println("쓸쓸한 가을입니다.");
                break;
            case "winter" :
                System.out.println("아직 겨울이네요ㅠㅠㅠㅠㅠㅠ");
                break;
            default :
                System.out.println("계절을 잘못입력했습니다.");
        }

    }
}