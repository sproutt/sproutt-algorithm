package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bo4641 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int i = Integer.parseInt(st.nextToken());
                if (i == -1) {
                    return;
                }
                list.add(i);
            }
            System.out.println(countDouble(list));
            list.clear();
        }
    }

    public static int countDouble(List<Integer> list) {
        int count = 0;
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) * 2 == list.get(j)) {
                    count++;
                }
                if (list.get(j) > list.get(i) * 2) {
                    break;
                }
            }
        }
        return count;
    }
}
