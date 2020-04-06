public class Game {
    int winBoard[][] = {{0, 1, 2}, // Check first row.
            {3, 4, 5}, // Check second Row
            {6, 7, 8}, // Check third Row
            {0, 3, 6}, // Check first column
            {1, 4, 7}, // Check second Column
            {2, 5, 8}, // Check third Column
            {0, 4, 8}, // Check first Diagonal
            {2, 4, 6}}; // Check second Diagonal

    boolean isPlayerWin(char[] playingBoard, char playerSymbol){
        for(int i = 0; i < 8; i++){
            if(playingBoard[winBoard[i][0]] == playerSymbol
                    && playingBoard[winBoard[i][1]] == playerSymbol
                    && playingBoard[winBoard[i][2]] == playerSymbol){
                return true;
            }
        }
        return false;
    }

    String gameFinalResult(char playingBoard[]) {
        int countX = 0;
        int countO = 0;
        int countEmpty = 0;
        String gameResults = "";

        for (int i = 0; i < 9; i++) {
            if (playingBoard[i] == 'X') {
                countX++;
            } else if (playingBoard[i] == 'O') {
                countO++;
            } else {
                countEmpty++;
            }
        }

        if (countEmpty != 0) {
            if (isPlayerWin(playingBoard, 'X')) {
                if (isPlayerWin(playingBoard, 'O')) {
                    gameResults = "Invalid game board";
                }else {
                    gameResults = "X wins!";
                }
            } else if (isPlayerWin(playingBoard, 'O')) {
                if (isPlayerWin(playingBoard, 'X')) {
                    gameResults = "Invalid game board";
                }else {
                    gameResults = "O wins!";
                }
            } else {
                gameResults = "Game still in progress";
            }
        } else {
            if (countX == countO || countX == countO + 1 || countO == countX + 1) {
                if (isPlayerWin(playingBoard, 'X')) {
                    if (isPlayerWin(playingBoard, 'O')) {
                        gameResults = "Invalid game board";
                    } else {
                        gameResults = "X wins!";
                    }
                } else if (isPlayerWin(playingBoard, 'O')) {
                    if (isPlayerWin(playingBoard, 'X')) {
                        gameResults = "Invalid game board";
                    } else {
                        gameResults = "O wins!";
                    }
                } else {
                    gameResults = "Its a draw!";
                }
            }
        }
        return gameResults;
    }
}
