package battleship;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BattleShipBoard {
    private char letters[] = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    List<Ship> battleShips = new ArrayList<>();
    private Coordinate coordinates[][] = new Coordinate[10][10];

    public BattleShipBoard(List<Ship> ships){
        this.battleShips = ships;
        initializeBoard();
        printCoordinates();
        printBoard();
        placeShips();
    }

    private void printBoard() {
        StringBuilder sb = new StringBuilder();
        sb.append(top()).append(System.getProperty("line.separator"));
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(j == 0){
                    sb.append(i + " | ");
                }
                sb.append("O   ");
                if(j == 9){
                    sb.append(System.getProperty("line.separator"));
                    break;
                }
            }
           // sb.append("--------------------------------").append(System.getProperty("line.separator"));
        }
        System.out.println(sb.toString());
    }

    private String top() {
        return "__| A | B | C | D | E | F | G | H | I | J ";
    }

    private void printCoordinates() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                sb.append(coordinates[i][j].toString() + " ");
                if(j == 9){
                    sb.append(System.getProperty("line.separator"));
                }
            }
        }
        System.out.println(sb.toString());
    }

    private void initializeBoard() {
        for(int i = 1; i <= 10; i++){
            for(int j = 0; j < 10; j++){
              coordinates[i-1][j] = new Coordinate(letters[i-1], j);
            }
        }
    }

    public void placeShips() {
        for(Ship ship : battleShips){
            switch (ship.type){
                case CARRIER:
                    System.out.println("Place your Carrier: " + ship.getName());
                    ship.setPosition(Stream.of(new Coordinate('A', 0),
                                               new Coordinate('B', 0),
                                               new Coordinate('C', 0),
                                               new Coordinate('D', 0),
                                               new Coordinate('E', 0))
                            .collect(Collectors.toCollection(HashSet::new)));
                    break;
                case CRUISER:
                    System.out.println("Place your Cruiser: " + ship.getName());
                    ship.setPosition(Stream.of(new Coordinate('D', 1),
                            new Coordinate('D', 2),
                            new Coordinate('D', 3))
                            .collect(Collectors.toCollection(HashSet::new)));
                    break;
                case DESTROYER:
                    System.out.println("Place your Destroyer: " + ship.getName());
                    ship.setPosition(Stream.of(new Coordinate('J', 0),
                            new Coordinate('J', 1))
                            .collect(Collectors.toCollection(HashSet::new)));
                    break;
                case BATTLESHIP:
                    System.out.println("Place your Battleship: " + ship.getName());
                    ship.setPosition(Stream.of(new Coordinate('A', 9),
                            new Coordinate('B', 9),
                            new Coordinate('C', 9),
                            new Coordinate('D', 9))
                            .collect(Collectors.toCollection(HashSet::new)));
                    break;
                case SUBMARINE:
                    System.out.println("Place your Submarine: " + ship.getName());
                    ship.setPosition(Stream.of(new Coordinate('G', 4),
                            new Coordinate('G', 5),
                            new Coordinate('G', 6))
                            .collect(Collectors.toCollection(HashSet::new)));
                    break;
            }
        }
    }
}
