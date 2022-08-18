package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon5622 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[12];

        numbers[0] = -1;
        numbers[1] = -1;
        for (int i = 2; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                numbers[i] = 0;
            } else {
                numbers[i] = i-1;
            }
        }

        String[] inputs = br.readLine()
                           .split("");

        int sum = 0;

        for (int i = 0; i < inputs.length; i++) {
            int number = -99;

            if(inputs[i].equals("A") || inputs[i].equals("B") || inputs[i].equals("C")) {
                number = 2;
            } else if(inputs[i].equals("D") || inputs[i].equals("E") || inputs[i].equals("F")) {
                number = 3;
            } else if(inputs[i].equals("G") || inputs[i].equals("H") || inputs[i].equals("I")) {
                number = 4;
            } else if(inputs[i].equals("J") || inputs[i].equals("K") || inputs[i].equals("L")) {
                number = 5;
            } else if(inputs[i].equals("M") || inputs[i].equals("N") || inputs[i].equals("O")) {
                number = 6;
            } else if(inputs[i].equals("P") || inputs[i].equals("Q") || inputs[i].equals("R") || inputs[i].equals("S")) {
                number = 7;
            } else if(inputs[i].equals("T") || inputs[i].equals("U") || inputs[i].equals("V")) {
                number = 8;
            } else if (inputs[i].equals("W") || inputs[i].equals("X") || inputs[i].equals("Y") || inputs[i].equals("Z")) {
                number = 9;
            } else {
                number = 0;
            }

            for (int j = 0; j < numbers.length; j++) {
                if (number == numbers[j]) {
                    sum += j;
                }
            }
        }
        System.out.println(sum);
    }
}
