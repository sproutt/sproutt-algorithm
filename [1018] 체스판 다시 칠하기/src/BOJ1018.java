import java.util.Scanner;

public class BOJ1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();


		boolean [][] arr = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < m; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				}
				else {
					arr[i][j] = false;
				}
			}
		}
		int tmpN = n - 7;
		int tmpM = m - 7;
		int min = 64;

		for (int i = 0; i < tmpN; i++) {
			for (int j = 0; j < tmpM ; j++) {
				int endX = i + 8;
				int endY = j + 8;
				int cnt = 0;

				boolean first = arr[i][j];

				for (int k = i; k < endX; k++) {
					for (int l = j; l <endY ; l++) {
						if(arr[k][l] != first)
							cnt++;
						first = !first;
					}
					first = !first;
				}

				cnt = Math.min(64-cnt, cnt);
				min = Math.min(cnt, min);
			}
		}
		System.out.println(min);
	}
}
