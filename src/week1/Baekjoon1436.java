package week1;

import java.util.*;

public class Baekjoon1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        int N = scanner.nextInt();

        String temp;

        ArrayList<Integer> tempLists = new ArrayList<>();

        for (int i = 0; i < 5000000; i++) {
            temp = String.valueOf(i);
            if (temp.contains("666")) {
                tempLists.add(Integer.parseInt(temp));
            }
        }

        Collections.sort(tempLists);
        System.out.println(tempLists.get(N-1));

        scanner.close();
    }
}