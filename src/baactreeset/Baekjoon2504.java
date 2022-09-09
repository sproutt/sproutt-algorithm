package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon2504 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        boolean flag = true;

        int result = 0;
        int temp = 1;

        String inputs = br.readLine();

        for (int i = 0; i < inputs.length(); i++) {
            char c = inputs.charAt(i);

            switch (c) {
                case '(':
                    temp *= 2;
                    stack.push(c);
                    break;
                case '[':
                    temp *= 3;
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    }
                    if (inputs.charAt(i-1) == '(') {
                        result += temp;
                    }
                    stack.pop();
                    temp /= 2;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        flag = false;
                        break;
                    }
                    if (inputs.charAt(i-1) == '[') {
                        result += temp;
                    }
                    stack.pop();
                    temp /= 3;
                    break;
            }
        }

        if (!flag || !stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}
