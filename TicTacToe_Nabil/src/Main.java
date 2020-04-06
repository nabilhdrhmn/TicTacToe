import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {
        Game playGame = new Game();
        Scanner scanInput = new Scanner(System.in);
        String boardString = scanInput.nextLine();
        char[] boardArray = boardString.toCharArray();

        System.out.println(playGame.gameFinalResult(boardArray));
    }
}
