package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bo1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        boolean[][] rectangle = new boolean[row][col];
        int rowCase = row - 7;
        int colCase = col - 7;

        for (int i = 0; i < row; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < col; j++) {
                if (split[j].equals("W")) {
                    rectangle[i][j] = true;
                } else {
                    rectangle[i][j] = false;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < rowCase; i++) {
            for (int j = 0; j < colCase; j++) {
                int count = countWrongPaint(i, j, rectangle);
                if (count < min) {
                    min = count;
                }
            }
        }
        System.out.println(min);

    }
    public static int countWrongPaint(int x, int y, boolean[][] rectangle) {
        int count = 0;
        boolean first = true;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (rectangle[i][j] != first) {
                    count++;
                }
                first = !first;
            }
            first = !first;
        }

        if (count > 64 - count) {
            return 64 - count;
        }
        return count;
    }
}

