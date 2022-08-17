package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Baekjoon3052 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            hashSet.add(Integer.parseInt(br.readLine()) % 42);
        }

        br.close();
        System.out.println(hashSet.size());
    }
}
