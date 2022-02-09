import java.util.Scanner;

public class BOJ13410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m + 1];

		for (int i = 1; i < m + 1; i++) {
			int tmp = n * i;
			String strTmp = Integer.toString(tmp);
			String rev = "";
			for (int j = strTmp.length() - 1; j >= 0; j--) {
				rev = rev + strTmp.charAt(j);
				arr[i] = Integer.parseInt(rev);
			}
		}

		int max = arr[1];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
