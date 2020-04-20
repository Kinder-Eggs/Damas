public class NormalPiece extends Piece {

    public NormalPiece(int pos, boolean team, int index) {
        super(pos, team, index);
    }

    public void move(int npos, Table table) {
        if(team) {  // If black piece
            if(npos - pos > 5) {  // Big movement (eating a piece)
                table.positions[pos] = 0;
                table.positions[npos] = index;
                if(pos > 27 || (pos < 24 && pos > 19) || (pos < 16 && pos > 11)) {
                    table.remove((int)Math.floor(((float)pos+(float)npos)/2));
                } else {
                    table.remove((int)Math.ceil(((float)pos+(float)npos)/2));
                }
                pos = npos;
            } else {  // Normal movement
                table.positions[pos] = 0;
                table.positions[npos] = index;
                pos = npos;
            }
        } else {  // If white piece
            if(pos - npos > 5) {
                table.positions[pos] = 0;
                table.positions[npos] = index;
                if(pos < 4 || (pos < 12 && pos > 7) || (pos < 20 && pos > 15)) {
                    table.remove((int)Math.ceil(((float)pos+(float)npos)/2));
                } else {
                    table.remove((int)Math.floor(((float)pos+(float)npos)/2));
                }
                pos = npos;
            } else {
                table.positions[pos] = 0;
                table.positions[npos] = index;
                pos = npos;
            }

        }
    }
}
