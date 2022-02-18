package algorithm;

import java.util.*;

public class RepaintChessBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String oneLine = scanner.next();
            for (int j = 0; j < m; j++) {
                char c = oneLine.charAt(j);
                board[i][j] = c;
            }
        }

        List<char[][]> chessBoards = new ArrayList<>();
        for (int y = 0; y < board.length - 7; y++) {
            for (int x = 0; x < board[y].length - 7; x++) {
                chessBoards.add(remakeChessBoardSize(board, y, x));
            }
        }

        List<Integer> results = new ArrayList<>();
        for (char[][] chessBoard : chessBoards) {
            results.add(count(chessBoard, 'B'));
            results.add(count(chessBoard, 'W'));
        }
        System.out.println(Collections.min(results));
    }

    public static char[][] remakeChessBoardSize (char[][] board, int y, int x) {
        char[][] movingChessBoard = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                movingChessBoard[i][j] = board[i + y][j + x];
            }
        }
        return movingChessBoard;
    }

    public static int count(char[][] movingChessBoard, char firstChar) {
        int result = 0;

        for (int i = 0; i < movingChessBoard.length; i++) {
            for (int j = 0; j < movingChessBoard[i].length; j++) {
                if (movingChessBoard[i][j] != firstChar) {
                    result++;
                }
                if (firstChar == 'B') {
                    firstChar = 'W';
                } else {
                    firstChar = 'B';
                }
            }
            if (firstChar == 'B') {
                firstChar = 'W';
            } else {
                firstChar = 'B';
            }
        }
        return result;
    }
}


