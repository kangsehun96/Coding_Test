package Level1.Q2_.Q29;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1. 세로 방향으로 반복
        for (int i = 0; i < b; i++) {
            // 가로 방향으로 반복
            for (int j = 0; j < a; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}