public class Table {
    int[] positions = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12}; // Black > 0; White < 0
    NormalPiece[] whitepieces = {new NormalPiece(20, false, -1), new NormalPiece(21, false, -2),
            new NormalPiece(22, false, -3), new NormalPiece(23, false, -4),
            new NormalPiece(24, false, -5), new NormalPiece(25, false, -6),
            new NormalPiece(26, false, -7), new NormalPiece(27, false, -8),
            new NormalPiece(28, false, -9), new NormalPiece(29, false, -10),
            new NormalPiece(30, false, -11), new NormalPiece(31, false, -12)};
    NormalPiece[] blackpieces = {new NormalPiece(0, true, 1), new NormalPiece(1, true, 2),
            new NormalPiece(2, true, 3), new NormalPiece(3, true, 4),
            new NormalPiece(4, true, 5), new NormalPiece(5, true, 6),
            new NormalPiece(6, true, 7), new NormalPiece(7, true, 8),
            new NormalPiece(8, true, 9), new NormalPiece(9, true, 10),
            new NormalPiece(10, true, 11), new NormalPiece(11, true, 12)};

    public void printTable() {
        for(int j = 0; j < 8; j++) {
            System.out.print(8-j);
            if (j % 2 == 1) {
                System.out.print(" ");
            } else {
                System.out.print("  -");
            }
            for (int i = 0; i < 4; i++) {
                if(positions[i+4*j] == 0) {
                    System.out.print(" -");
                } else if(positions[i+4*j] > 0) {
                    System.out.print(" P");
                } else {
                    System.out.print(" B");
                }
                if( j % 2 == 1 || i != 3) {
                    System.out.print(" -");
                }
            }
            System.out.println();
        }
        System.out.println("   a b c d e f g h");
    }

    public void remove(int pos) {
        positions[pos] = 0;

    }
}
