package algorithm;

import java.util.Scanner;

public class Director {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 665;
        int count = 0;

        while(count != n) {
            num++;
            String s = Integer.toString(num);
            if(s.contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
