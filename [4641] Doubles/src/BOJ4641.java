import java.util.ArrayList;
import java.util.Scanner;

public class BOJ4641 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			ArrayList<Integer> lst = new ArrayList<>();
			while (true) {
				int tmp = sc.nextInt();
				if (tmp == 0){
					break;
				}
				lst.add(tmp);
				if (tmp == -1){
					return;
				}
			}
			int cnt = 0;
			for(int i : lst){
				for(int j : lst){
					if (i * 2 == j){
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
