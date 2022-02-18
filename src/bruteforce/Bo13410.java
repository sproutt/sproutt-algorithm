package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Bo13410 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= k ; i++) {
            list.add(n * i);
        }
        System.out.println(Collections.max(reverse(list)));
    }

    public static List reverse(List<Integer> list) {
        return list.stream()
                .map(Bo13410::reverseValue)
                .collect(Collectors.toList());

    }

    public static Integer reverseValue(Integer value) {
        String[] split = value.toString().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= split.length; i++) {
            sb.append(split[split.length-i]);
        }
        return Integer.parseInt(sb.toString());
    }
}
