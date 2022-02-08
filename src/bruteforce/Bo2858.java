package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class TileBatch {
    int x;
    int y;

    public TileBatch(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Bo2858 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        List<TileBatch> totalDivisors = calculateDivisor(r + b);
        List<TileBatch> blackDivisors = calculateDivisor(b);

        for (int i = 0; i < blackDivisors.size(); i++) {
            for (int j = 0; j < totalDivisors.size(); j++) {
                if (compare(blackDivisors.get(i), totalDivisors.get(j))) {
                    System.out.println(totalDivisors.get(j).x + " " + totalDivisors.get(j).y);
                    return;
                }
            }
        }
    }

    public static List<TileBatch> calculateDivisor(int integer) {
        List<TileBatch> list = new ArrayList<>();
        for (int i = integer; i > 0; i--) {
            if (integer % i == 0) {
                list.add(new TileBatch(i, integer / i));
            }
        }
        return list;
    }

    public static boolean compare(TileBatch black, TileBatch total) {
        if (black.x + 2 == total.x && black.y + 2 == total.y) {
            return true;
        }
        return false;
    }
}

