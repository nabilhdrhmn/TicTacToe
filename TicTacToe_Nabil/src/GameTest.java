import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void playerXWin(){
        Game testGame = new Game();
        String input = "XOXXOOXXO";
        char[] inputToArray = input.toCharArray();
        assertEquals("X wins!", testGame.gameFinalResult(inputToArray), "Output must be : X wins!");
    }

    @Test
    public void playerOWin(){
        Game testGame = new Game();
        String input = "XOOXOXOXO";
        char[] inputToArray = input.toCharArray();
        assertEquals("O wins!", testGame.gameFinalResult(inputToArray), "Output must be : O wins!");
    }

    @Test
    public void playerDraw(){
        Game testGame = new Game();
        String input = "OXOXOXXOX";
        char[] inputToArray = input.toCharArray();
        assertEquals("Its a draw!", testGame.gameFinalResult(inputToArray), "Output must be : Its a draw!");
    }

    @Test
    public void gameInProgress(){
        Game testGame = new Game();
        String input = "XOXX--O--";
        char[] inputToArray = input.toCharArray();
        assertEquals("Game still in progress", testGame.gameFinalResult(inputToArray), "Output must be : Game still in progress");
    }

    @Test
    public void invalidBoard(){
        Game testGame = new Game();
        String input = "XXXOOOXXO";
        char[] inputToArray = input.toCharArray();
        assertEquals("Invalid game board", testGame.gameFinalResult(inputToArray), "Output must be : Invalid game board");
    }

}