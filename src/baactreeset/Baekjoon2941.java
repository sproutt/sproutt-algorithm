package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2941 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c=='c') {
                if(i <input.length()-1) {
                    if (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-') {
                        continue;
                    }
                }
            } else if(c=='d') {
                if (i < input.length() - 1) {
                    if (input.charAt(i + 1) == 'z') {
                        if(i<input.length()-2) {
                            if(input.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (input.charAt(i + 1) == '-') {
                        continue;
                    }
                }

            } else if(c=='z') {
                if(i < input.length()-1) {
                    if (input.charAt(i + 1) == '=') {
                        continue;
                    }
                }
            } else if(c=='l') {
                if (i < input.length() - 1) {
                    if ((input.charAt(i + 1) == 'j')) {
                        continue;
                    }
                }
            } else if (c == 'n') {
                if(i<input.length() -1) {
                    if ((input.charAt(i + 1) == 'j')) {
                        continue;
                    }
                }
            } else if (c=='s') {
                if (i < input.length() - 1) {
                    if ((input.charAt(i + 1) == '=')) {
                        continue;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
