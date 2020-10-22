package battleship;

import java.util.Set;

enum ShipType {
    CARRIER(5),
    BATTLESHIP(4),
    SUBMARINE(3),
    DESTROYER(2),
    CRUISER(3);

    public static final Set<ShipType> FLEET = Set.of(CARRIER, BATTLESHIP, SUBMARINE, DESTROYER, CRUISER);

    private int hitPoints;

    ShipType(int hitPoints){
        this.hitPoints = hitPoints;
    }
}
