public class Table {
    int positions[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}; // 1 == Black; 2 == White

    public void printTable() {
        for(int j = 0; j < 8; j++) {
            System.out.print(8-j);
            if (j % 2 == 0) {
                System.out.print(" ");
            } else {
                System.out.print("  -");
            }
            for (int i = 0; i < 4; i++) {
                if(positions[i+4*j] == 0) {
                    System.out.print(" -");
                } else if(positions[i+4*j] == 1) {
                    System.out.print(" P");
                } else {
                    System.out.print(" B");
                }
                if( j % 2 == 0 || i != 3) {
                    System.out.print(" -");
                }
            }
            System.out.println();
        }
        System.out.println("   a b c d e f g h");
    }
}
