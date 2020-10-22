package battleship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BattleShipGame {
    private BattleShipBoard playerBoard;
    private Player player;

    private final Scanner playerInput;

    public BattleShipGame(Scanner playerInput) {
        System.out.println("Welcome to BattleShip!");
        this.playerInput = playerInput;
    }

    public BattleShipBoard getPlayerBoard() {
        return playerBoard;
    }

    public void setPlayerBoard(BattleShipBoard playerBoard) {
        this.playerBoard = playerBoard;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setupGame() {
      createPlayer();
      initializeBoard();
      //displayPopulatedPlayerBoard()
    }

    private void createPlayer() {
        System.out.println("Please enter your name: ");
        setPlayer(new Player(playerInput.next()));
    }

    private void initializeBoard() {
        player.setPlayerBoard(new BattleShipBoard(createShips()));
    }

    private List<Ship> createShips(){
        List<Ship> playerShips = new ArrayList<>();
        for(ShipType type : ShipType.FLEET){
            System.out.println("Please name your " + type);
            playerShips.add(new Ship(type, playerInput.next()));
        }
        return playerShips;
    }

    public boolean playGame() {
        setupGame();
        //player interaction
        placeShipRoutine(); //do this for each player
        //while(true){
            //begin turn based repetition
        //}
        return true;
    }

    private void placeShipRoutine() {
        for (Ship ship : player.getPlayerBoard().battleShips){
            System.out.println("Please place your " + ship.type + " Class, the " + ship.name);
            playerInput.next();
        }
    }
}
