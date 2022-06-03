package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] arr = input.split("");

        Integer[] sortingArr = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sortingArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(sortingArr, Comparator.reverseOrder());

        for (Integer i : sortingArr) {
            System.out.print(i);
        }
    }
}
