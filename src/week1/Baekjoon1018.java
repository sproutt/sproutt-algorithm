package week1;

import java.util.Scanner;

public class Baekjoon1018 {
    static boolean[][] temp;
    static int min = 64;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();

        temp = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            String s = scanner.next();
            for (int j = 0; j < column; j++) {
                if(s.charAt(j) == 'W')
                    temp[i][j] = true;
                else
                    temp[i][j] = false;
            }
        }

        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < column - 7; j++) {
                search(i, j);
            }
        }

        System.out.println(min);
    }

    private static void search(int x, int y) {
        int count = 0;

        boolean firstBoolean = temp[x][y];

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (temp[i][j] != firstBoolean) {
                    count++;
                }
                firstBoolean = !firstBoolean;
            }
            firstBoolean = !firstBoolean;
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
