package battleship;

public class Player {
    private String name;
    private BattleShipBoard playerBoard;
    private BattleShipBoard opponentBoard;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BattleShipBoard getPlayerBoard() {
        return playerBoard;
    }

    public void setPlayerBoard(BattleShipBoard playerBoard) {
        this.playerBoard = playerBoard;
    }

    public BattleShipBoard getOpponentBoard() {
        return opponentBoard;
    }

    public void setOpponentBoard(BattleShipBoard opponentBoard) {
        this.opponentBoard = opponentBoard;
    }
}
