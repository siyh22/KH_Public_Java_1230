package 주사위게임;
// 두개의 주사위를 던져 합이 12가 나오면 종료 하는 게임

public class RandomEx1 {
    public static void main(String[] args) {
        while(true) {
            int num1 = (int) ((Math.random() * 6) + 1);
            int num2 = (int) ((Math.random() * 6) + 1);
            if(num1 + num2 == 12) {
                System.out.println("무인도를 탈출합니다.");
                break;
            }
            System.out.println("주사위의 합은 " + (num1 + num2) + "입니다.");
        }
    }
}


/*
i do the same thing, i told you that i never would
i told you i changed, even when i knew i never could
i know that i can't find nobody else as good as you
i need you to stay, need you to stay, hey

i get drunk, wake up, i'm wasted still
i realize the time that i wasted here
i feel like you can't feel the way i feel
i'll be fucked up if can't be right here

when i'm away from you, i miss your touch
you're the reason i believe in love
it's been difficult for me to trust
and i'm afraid that  i can leave you stranded
cause you ain't never left me empty-handed
and you know that i know that i can't live without you
so,baby,stay
 */