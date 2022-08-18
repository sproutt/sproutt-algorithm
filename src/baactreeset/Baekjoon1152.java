package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1152 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<String> inputs = new ArrayList<>();
        while (st.hasMoreTokens()) {
            inputs.add(st.nextToken());
        }

        System.out.println(inputs.size());
    }
}
