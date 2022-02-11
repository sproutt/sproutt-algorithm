package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        while(true) {
            int num = scanner.nextInt();
            if(num == -1) {
                break;
            }
            list.add(num);
        }

        List<Integer> temp = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (Integer i : list) {
            if(i == 0) {
                Collections.sort(temp);
                result.add(findDoublesCount(temp));
                temp = new ArrayList<>();
                continue;
            }
            temp.add(i);
        }

        result.forEach(i -> System.out.println(i));
    }

    public static int findDoublesCount(List<Integer> list) {
        int temp = 0;
        for(int i = 0; i < list.size() - 1; i++) {
            for(int j = i+1; j < list.size(); j++) {
                if(list.get(i) * 2 == list.get(j)) {
                    temp++;
                }
            }
        }
        return temp;
    }
}
