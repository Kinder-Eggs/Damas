public class main {
    public static void main(String[] args) {
        CSVReader csv = new CSVReader();
        csv.setDataSource("C:/Users/Gasni/IdeaProjects/Damas/src/db/arq001.csv");
        String commands[] = csv.requestCommands();
        System.out.println("Tabuleiro Inicial:");
        Table table = new Table();
        table.printTable();

        for(int i = 0; i < commands.length; i++) {
            int piece = table.positions[csvToPos(commands[i].substring(0,2))];
            if (piece > 0){
                table.blackpieces[piece-1].move(csvToPos(commands[i].substring(3,5)), table);
            } else {
                table.whitepieces[-piece-1].move(csvToPos(commands[i].substring(3,5)), table);
            }
            System.out.println("Source: " + commands[i].substring(0,2));
            System.out.println("Target: " + commands[i].substring(3,5));
            table.printTable();
        }
    }

    private static int csvToPos(String coord) {
        char col = coord.charAt(0);
        int lin = Integer.parseInt(coord.substring(1, 2));
        if (col == 'a') {
            if (lin == 7) {
                return 4;
            } else if (lin == 5) {
                return 12;
            } else if (lin == 3) {
                return 20;
            } else {
                return 28;
            }
        } else if (col == 'b') {
            if (lin == 8) {
                return 0;
            } else if (lin == 6) {
                return 8;
            } else if (lin == 4) {
                return 16;
            } else {
                return 24;
            }

        } else if (col == 'c') {
            if (lin == 7) {
                return 5;
            } else if (lin == 5) {
                return 13;
            } else if (lin == 3) {
                return 21;
            } else {
                return 29;
            }

        } else if (col == 'd') {
            if (lin == 8) {
                return 1;
            } else if (lin == 6) {
                return 9;
            } else if (lin == 4) {
                return 17;
            } else {
                return 25;
            }

        } else if (col == 'e') {
            if (lin == 7) {
                return 6;
            } else if (lin == 5) {
                return 14;
            } else if (lin == 3) {
                return 22;
            } else {
                return 30;
            }

        } else if (col == 'f') {
            if (lin == 8) {
                return 2;
            } else if (lin == 6) {
                return 10;
            } else if (lin == 4) {
                return 18;
            } else {
                return 26;
            }

        } else if (col == 'g') {
            if (lin == 7) {
                return 7;
            } else if (lin == 5) {
                return 15;
            } else if (lin == 3) {
                return 23;
            } else {
                return 31;
            }

        } else {
            if (lin == 8) {
                return 3;
            } else if (lin == 6) {
                return 11;
            } else if (lin == 4) {
                return 19;
            } else {
                return 27;
            }

        }
    }
}
