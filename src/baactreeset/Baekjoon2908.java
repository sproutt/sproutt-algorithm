package baactreeset;

import java.io.*;
import java.util.*;

public class Baekjoon2908 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine()
                       .split(" ");


        StringBuilder sb1 = new StringBuilder();

        for (int i = inputs[0].length()-1; i >= 0; i--) {
            sb1.append(inputs[0].charAt(i));
        }

        StringBuilder sb2 = new StringBuilder();

        for (int i = inputs[1].length()-1; i >= 0; i--) {
            sb2.append(inputs[1].charAt(i));
        }

        if (Integer.parseInt(sb1.toString()) > Integer.parseInt(sb2.toString())) {
            System.out.println(Integer.parseInt(sb1.toString()));
        } else {
            System.out.println(Integer.parseInt(sb2.toString()));
        }
    }
}
