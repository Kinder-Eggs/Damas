public class NormalPiece extends Piece {

    public int move(int npos, Table table) {
        if(team) {  // If black piece
            if(npos - pos > 5) {  // Big movement (eating a piece)
                table.positions[pos] = 0;
                table.positions[npos] = 1;
                pos = npos;
                while(true) {  // Searches for piece to be eaten and removes it from the game
                    ;
                }
            } else {  // Normal movement
                pos = npos;
            }
        } else {  // If white piece
            if(pos - npos > 5) {
                table.positions[pos] = 0;
                table.positions[npos] = 2;
                pos = npos;
                while(true) {
                    ;
                }
            } else {
                pos = npos;
            }

        }
        return 0;
    }
}
