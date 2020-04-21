public class DoublePiece extends Piece {

    public DoublePiece(boolean team, int index) {
        super(team, index);
    }

    public void move(int npos, Table table) {
        if (npos == 0) {
            if (pos != 4) {
                table.remove(5);
            }
        } else if (npos == 1) {
            if (pos == 12 || pos == 8 || pos == 5) {
                table.remove(5);
            } else {
                table.remove(6);
            }
        } else if (npos == 2) {
            if (pos == 7 || pos == 11) {
                table.remove(7);
            } else {
                table.remove(6);
            }
        } else if (npos == 3) {
            table.remove(7);
        } else if (npos == 4) {
            if (pos != 0) {
                table.remove(8);
            }
        } else if (npos == 5) {
            if (pos == 12) {
                table.remove(8);
            } else if (pos == 14 || pos == 18 || pos == 23 || pos == 27) {
                table.remove(9);
            }
        } else if (npos == 6) {
            if (pos == 15 || pos == 19) {
                table.remove(10);
            } else if (pos == 13 || pos == 16 || pos == 20) {
                table.remove(9);
            }
        } else if (npos == 7) {
            if (pos != 3 && pos != 2 && pos != 11) {
                table.remove(10);
            }
        } else if (npos == 8) {
            if (pos == 1) {
                table.remove(5);
            } else if (pos == 17 || pos == 22 || pos == 26 || pos == 31){
                table.remove(13);
            }
        } else if (npos == 9) {
            if(pos == 0) {
                table.remove(5);
            } else if (pos == 2) {
                table.remove(6);
            } else if (pos == 16 || pos == 20) {
                table.remove(13);
            } else if (pos == 18 || pos == 23 || pos == 27) {
                table.remove(14);
            }
        } else if (npos == 10) {
            if(pos == 1) {
                table.remove(6);
            } else if (pos == 3) {
                table.remove(7);
            } else if (pos == 17 || pos == 21 || pos == 24 || pos == 28) {
                table.remove(14);
            } else if (pos == 19){
                table.remove(15);
            }
        } else if (npos == 11) {
            if(pos == 2) {
                table. remove(7);
            } else if (pos == 18 || pos == 22 || pos == 25 || pos == 29) {
                table.remove(15);
            }
        } else if (npos == 12) {
            if (pos == 1 || pos == 5) {
                table.remove(8);
            } else if (pos == 21 || pos == 25 || pos == 30) {
                table.remove(16);
            }
        } else if (npos == 13) {
            if (pos == 4) {
                table.remove(8);
            } else if (pos == 2 || pos == 6) {
                table.remove(9);
            } else if (pos == 20) {
                table.remove(16);
            } else if (pos == 22 || pos == 26 || pos == 31) {
                table.remove(17);
            }
        } else if (npos == 14) {
            if (pos == 7 || pos == 3) {
                table.remove(10);
            } else if (pos == 23 || pos == 27) {
                table.remove(18);
            } else if (pos == 0 || pos == 5) {
                table.remove(9);
            } else if (pos == 21 || pos == 24 || pos == 28) {
                table.remove(17);
            }
        } else if (npos == 15) {
            if (pos == 1 || pos == 6) {
                table.remove(10);
            } else if (pos == 22 || pos == 25 || pos == 29){
                table.remove(18);
            }
        } else if (npos == 16) {
            if (pos == 2 || pos == 6 || pos == 9) {
                table.remove(13);
            } else if (pos == 25 || pos == 30){
                table.remove(21);
            }
        } else if (npos == 17) {
            if (pos == 8 || pos == 4) {
                table.remove(13);
            } else if (pos == 24 || pos == 28) {
                table.remove(21);
            } else if (pos == 26 || pos == 31) {
                table.remove(22);
            } else if (pos == 3 || pos == 7 || pos == 10) {
                table.remove(14);
            }
        } else if (npos == 18) {
            if (pos == 25 || pos == 29) {
                table.remove(22);
            } else if (pos == 26 || pos == 31) {
                table.remove(23);
            } else if (pos == 11) {
                table.remove(15);
            } else if (pos == 0 || pos == 5 || pos == 9) {
                table.remove(14);
            }
        } else if (npos == 19) {
            if (pos == 26 || pos == 30) {
                table.remove(23);
            } else if (pos == 1 || pos == 6 || pos == 10) {
                table.remove(15);
            }
        } else if (npos == 20){
            if (pos == 29 || pos == 24) {
                table.remove(24);
            } else {
                table.remove(16);
            }
        } else if (npos == 21) {
            if (pos == 28) {
                table.remove(24);
            } else if (pos == 30) {
                table.remove(25);
            } else if (pos == 12) {
                table.remove(16);
            } else if (pos == 3 || pos == 7 || pos == 10 || pos == 14) {
                table.remove(17);
            }
        } else if (npos == 22) {
            if (pos == 29) {
                table.remove(25);
            } else if (pos == 31) {
                table.remove(26);
            } else if (pos == 15 || pos == 11) {
                table.remove(18);
            } else if (pos == 4 || pos == 8 || pos == 13) {
                table.remove(17);
            }
        } else if (npos == 23) {
            if (pos == 30) {
                table.remove(26);
            } else if (pos == 0 || pos == 5 || pos == 9 || pos == 14){
                table.remove(18);
            }
        } else if (npos == 24) {
            if(pos != 28 && pos != 20 && pos != 29) {
                table.remove(21);
            }
        } else if (npos == 25) {
            if (pos == 16 || pos == 12) {
                table.remove(21);
            } else if (pos != 30 && pos != 29) {
                table.remove(22);
            }
        } else if (npos == 26) {
            if (pos == 4 || pos == 8 || pos == 13 || pos == 17) {
                table.remove(22);
            } else if (pos == 19) {
                table.remove(23);
            }
        } else if (npos == 27) {
            if (pos != 23 && pos != 30 && pos != 31) {
                table.remove(22);
            }
        } else if (npos == 28) {
            table.remove(25);
        } else if (npos == 29) {
            if (pos == 20 || pos == 24) {
                table.remove(24);
            } else {
                table.remove(25);
            }
        } else if (npos == 30) {
            if (pos == 23 || pos == 26 || pos == 19) {
                table.remove(26);
            } else {
                table.remove(25);
            }
        } else {
            if (pos != 27) {
                table.remove(26);
            }
        }

        table.positions[pos] = 0;
        table.positions[npos] = index;
        pos = npos;
    }
}
