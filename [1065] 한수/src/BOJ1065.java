import java.util.Scanner;

public class BOJ1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int cnt = 0;
		while(i <= n){
			if(i<100){
				cnt++;
				i++;
				continue;
			}
			String str = Integer.toString(i);
			boolean flag =true;
			if (str.charAt(1) - str.charAt(0) != str.charAt(2) - str.charAt(1))
				flag = false;
			if(flag)
				cnt++;
			i++;
		}

		System.out.println(cnt - 1);
	}
}
