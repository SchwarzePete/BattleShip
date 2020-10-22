package battleship;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        try(Scanner playerInput = new Scanner(System.in)) {
            System.out.println("Welcome to BattleShip!  Would you like to play?!  Yes/No?");
            if(positive(playerInput.next())){
                BattleShipGame game = new BattleShipGame(playerInput);
                if(game.playGame()){
                    //play again feature
                }
            }
        }
    }

    private static boolean positive(String input) {
        return input.toLowerCase().equals("yes") || input.toLowerCase().equals("y");
    }
}
