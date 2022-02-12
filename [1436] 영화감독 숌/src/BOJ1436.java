import java.util.Scanner;

public class BOJ1436 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int res = 666;

		int cnt = 1;

		while (cnt != n) {
			res++;
			if (String.valueOf(res).contains("666"))
				cnt++;
		}
		System.out.println(res);
	}
}
