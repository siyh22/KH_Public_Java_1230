package 다중for문;

// 별찍기 응용
// 정수 입력 받기 : 4
// *
// * *
// * * *
// * * * *

import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("정수 입력 : ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
        for(int i = 1; i <= number; i++) {
            if(i % 2 == 0) continue; //★ % << 찾기
            System.out.println(i);
 */


/*
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i*j));
            }
            System.out.println("-----------------------");
        }
    }
 */


/*
        Scanner sc= new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        for(int i = 0; i < number; i++) {
            System.out.printf("|%d| ", i);
            for(int j = 0; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
 */
