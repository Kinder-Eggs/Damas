public class Main {
    public static void main() {
        CSVReader csv = new CSVReader();
        csv.setDataSource("C:/Users/Gasni/IdeaProjects/Damas/src/db/arq001.csv");
        String commands[] = csv.requestCommands();
        Table table = new Table();
    }
}
