package battleship;

import java.util.Set;

public class Ship {
    Set<Coordinate> position;
    ShipType type;
    String name;

    public Ship(ShipType type, String name){
        this.type = type;
        this.name = name;
    }
    public Set<Coordinate> getPosition() {
        return position;
    }

    public void setPosition(Set<Coordinate> position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShipType getType() {
        return type;
    }

    public void setType(ShipType type) {
        this.type = type;
    }
}
