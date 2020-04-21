public class NormalPiece extends Piece {
    boolean isdouble;

    public NormalPiece(int pos, boolean team, int index) {
        super(team, index);
        this.pos = pos;
        isdouble = false;
    }

    public void move(int npos, Table table) {
        if(!isdouble) { //20 13
            if (team) {  // If black piece
                if(npos > 27) {
                    isdouble = true;
                    table.blackdoublepieces[index-1].pos = npos;
                }
                if (npos - pos > 5 || pos - npos > 5) {  // Big movement (eating a piece)
                    table.positions[pos] = 0;
                    table.positions[npos] = index;
                    if (pos > 27 || (pos < 24 && pos > 19) || (pos < 16 && pos > 11) || (pos > 3 && pos < 8)) {
                        table.remove((int) Math.floor(((float) pos + (float) npos) / 2));
                    } else {
                        table.remove((int) Math.ceil(((float) pos + (float) npos) / 2));
                    }
                    pos = npos;
                } else {  // Normal movement
                    table.positions[pos] = 0;
                    table.positions[npos] = index;
                    pos = npos;
                }
            } else {  // If white piece
                if(npos < 4) {
                    isdouble = true;
                    table.whitedoublepieces[-(index-1)].pos = npos;
                }
                if (pos - npos > 5 || npos - pos > 5) {
                    table.positions[pos] = 0;
                    table.positions[npos] = index;
                    if (pos < 4 || (pos < 12 && pos > 7) || (pos < 20 && pos > 15) || (pos < 28 && pos > 23)) {
                        table.remove((int) Math.ceil(((float) pos + (float) npos) / 2));
                    } else {
                        table.remove((int) Math.floor(((float) pos + (float) npos) / 2));
                    }
                    pos = npos;
                } else {
                    table.positions[pos] = 0;
                    table.positions[npos] = index;
                    pos = npos;
                }

            }
        } else {
            if(team) {
                table.blackdoublepieces[index-1].move(npos, table);
            } else {
                table.whitedoublepieces[(-index)-1].move(npos, table);
            }
            pos = npos;
        }
    }
}
