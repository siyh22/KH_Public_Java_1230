package 반복문기본;

import java.util.Scanner;

public class WhileBasic {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("입력 받은 정수의 합은 " + sum + " 입니다.");
    }
}


/*while(number > 0) {
        sum += number;   //sum = sum + number;
        number--;
        }
        System.out.println("입력 받은 정수의 합은 " + sum + " 입니다.");
 */


/* number = 10
19 = 10 + 9
19+8
27+7
34+6
40+5
45+4
49+3
52+2
54+1
55
 */

