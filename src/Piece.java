public class Piece {
    int pos;
    boolean team; // True = Black, False = White
    int index;
    boolean alive;

    public Piece(int pos, boolean team, int index) {
        this.pos = pos;
        this.team = team;
        this.index = index;
        alive = true;
    }
}
