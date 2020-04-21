public class Piece {
    int pos;
    boolean team; // True = Black, False = White
    int index;

    public Piece(boolean team, int index) {
        this.team = team;
        this.index = index;
    }
}
