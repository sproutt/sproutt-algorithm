package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon10799 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    stack.pop();
                    if(input.charAt(i-1) == '(') {
                        result += stack.size();
                    } else {
                        result++;
                    }
            }
        }
        System.out.println(result);
    }
}
