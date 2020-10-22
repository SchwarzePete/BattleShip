package battleship;

public class Coordinate {
    char x;
    int y;

    public Coordinate(char x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "" + x + y;
    }
}
