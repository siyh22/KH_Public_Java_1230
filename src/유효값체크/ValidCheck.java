package 유효값체크;
import java.util.Scanner;

// while문은 먼저 조건을 확인하고 반복문을 수행
// do ~ while문은 먼저 수행하고 조건을 확인 함

public class ValidCheck {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("나이를 입력하세요 : ");
            age = sc.nextInt();

        } while (age <=0 || age >= 200);

        System.out.println("당신의 나이는 " + age + "입니다.");

    }
}

/*
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt(); // 정상적인 입력이 될 때 까지 반복적으로 나이를 입력 받음
            if(age > 0 && age < 200) break; // 조건을 만족하면 반복문을 탈출함
            System.out.println("나이를 잘못입력하셨습니다.");
        }
        System.out.println("입력하신 나이는 " + age + "입니다.");
 */