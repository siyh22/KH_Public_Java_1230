package 연산자기본;

import java.util.Scanner;

// 산술연산자 : +, -, *, /, %(나머지)
// 대입연산자 = : 변수에 값을 대입할 때 사용하는 이항 연산자 입니다. (방향이 오른쪽에서 왼쪽으로 진행)
// 증감연산자 : ++, -- 단항연산자, 피연산자의 값을 1증가 또는 1감소 시킴
// 비교연산자 : 두개의 피연산자를 비교해서 참과 거짓을 판별하는 것
// 논리연산자 : AND(&&) 두개의 조건이 모두 참이면 참
// OR(||) 두개의 조건 중 하나만 참이면 참, NOT(!) 현재의 조건을 부정
// 삼항연산자 : 항이 3개인 연산자, 조건문의 일종이며 참과 거짓만 있는 경우 사용 가능
// 문자열 결합 연산자 : +
// 연산자 우선 순위
public class OperatorEx1 {
    public static void main(String[] args) {
        int val1 = 5, val2 = 5, val3 = 5;
        int rst1, rst2, rst3;
        rst1 = val1 + val2 * val3; // 30
        rst2 = (val1 + val2) * val3; //50
        rst3 = val1 + (++val2) * val3; //35

    }
}

//        int num1 =10, num2 = 0;
//        System.out.println("+ 연산자 : " + (num1 + num2));
//                System.out.println("- 연산자 : " + (num1 - num2));
//                System.out.println("* 연산자 : " + (num1 * num2));
//                try {
//                System.out.println("/ 연산자 : " + (num1 / num2)); // 몫을 구함
//                } catch(ArithmeticException e) {
//                System.out.println("값을 0으로 나누면 안됩니다.");
//                }
//        System.out.println("/ 연산자 : " + ((double)num1 / num2)); // 나눗셈의 결과를 구함
//        System.out.println("% 연산자 : " + (num1 % num2));

//    int x, y, z = 10;
//       x = y = z;
//                System.out.println(x+ " " + y +" " + z);
//                int num1 = 10;
//                System.out.println(num1 += 2); // num1 = num1 + 2
//                System.out.println(num1 -= 2); // num1 = num1 - 2
//                System.out.println(num1 *= 2); // num1 = num1 * 2
//                System.out.println(num1 /= 2); // num1 = num1 / 2
//                System.out.println(num1 %= 2); // num1 = num1 % 2

//    int num1 = 10;
//        System.out.println(num1--); // num1 값을 사용 후 증가 시킴
//                System.out.println(num1);

//    int x = 10, y = 20;
//        System.out.println(x > y); // false
//                System.out.println(x < y); // true
//        System.out.println(x >= y); // false
//        System.out.println(x <= y); // true
//        System.out.println(!(x <= y)); // false

//    int x = 10, y = 20;
//    boolean rst1, rst2, rst3;
//        rst1 = (x > 0) && (x > y); // false, 먼저 나오는 조건이 거짓이면 뒤의 조건을 보지 않음
//                rst2 = (x > 0) || (x > y); // true
//                rst3 = !((x > 0) || (x > y)); // false
//                System.out.println(rst1);
//                System.out.println(rst2);
//                System.out.println(rst3);

//    Scanner sc = new Scanner(System.in); // 입력을 받기 위한 스캐너 객체 생성
//        System.out.print("나이를 입력하세요 : ");
//                int age = sc.nextInt();
//                boolean isAdult = (age > 19) ? true : false;
//                System.out.println(isAdult);

//        System.out.println("Java" + (11.04 + 12));