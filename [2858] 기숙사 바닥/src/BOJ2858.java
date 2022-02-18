import java.util.Scanner;

public class BOJ2858 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int b = sc.nextInt();
		int l = 0;
		int w = 0;

		for (int i = 3; i < 5000; i++) {
			for (int j = 3; j < 4000; j++) {
				if(r+b == i*j){
					if(r == (i*2) + (j-2) * 2){
						l = i;
						w = j;
						break;
					}
					else if (r == (j*2) + (i-2)*2){
						l = j;
						w = i;
						break;
					}
				}
			}
		}
		System.out.println(l + " " + w);
	}
}
