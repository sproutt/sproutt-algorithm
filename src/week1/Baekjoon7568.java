package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon7568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();


        ArrayList<Integer> weightLists = new ArrayList<>();
        ArrayList<Integer> heightLists = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int weight = scanner.nextInt();
            int height = scanner.nextInt();
            weightLists.add(weight);
            heightLists.add(height);
        }

        ArrayList<Integer> rankLists = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (weightLists.get(i) < weightLists.get(j) && heightLists.get(i) < heightLists.get(j)) {
                    rank++;
                }
            }
            rankLists.add(rank);
        }

        for (int i = 0; i < rankLists.size(); i++) {
            System.out.print(rankLists.get(i) + " ");
        }

        scanner.close();
    }
}