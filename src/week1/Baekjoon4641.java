package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon4641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int count = 0;

        List<Integer> lists = new ArrayList<>();
        List<Integer> resultLists = new ArrayList<>();

        while (input != -1) {
            input = scanner.nextInt();

            lists.add(input);
            if (input == 0) {
                for (int i = 0; i < lists.size(); i++) {
                    for (int j = 0; j < lists.size(); j++) {
                        if (lists.get(i) * 2 == lists.get(j) && lists.get(i) != 0) {
                            count++;
                        }
                    }
                }
                resultLists.add(count);
                lists.clear();
                count = 0;
            }
        }

        for (int i = 0; i < resultLists.size(); i++) {
            System.out.println(resultLists.get(i));
        }
        scanner.close();
    }
}
