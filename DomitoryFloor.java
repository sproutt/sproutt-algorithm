package algorithm;

import java.util.Scanner;

public class DomitoryFloor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int redTileCount = scanner.nextInt();
        int brownTileCount = scanner.nextInt();

        for(int i = 1; i < redTileCount; i++) {
            for(int j = 1; j < redTileCount; j++) {
                if(i * 2 + (j - 2) * 2 == redTileCount && (i - 2) * (j - 2) == brownTileCount) {
                    System.out.println(j + " " + i);
                    return;
                }
            }
        }
    }
}