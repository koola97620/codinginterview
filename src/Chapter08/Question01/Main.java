package Chapter08.Question01;

/*
    8-1
    트리플 스텝 : 어떤 아이가 n개의 계단을 오른다. 한 번에 1계단 오르기도 하고, 2계단이나 3계단을 오르기도
    한다. 계단을 오르는 방법이 몇 가지가 있는지 계산하는 메서드를 구현하라.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 3;
        int result = downStairs(n);
        System.out.println(result);


    }

    public static int downStairs(int n) {
        if(n==0) {
            return 1;
        }
        else if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else{
            return downStairs(n-1) + downStairs(n-2) + downStairs(n-3);
        }
    }


}
