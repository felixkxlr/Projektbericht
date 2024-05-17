package Projektbericht.Implementierung; 

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aggregator aggregator = new Aggregator();
        Sorter sorter = new Sorter();
        ArrayList<Row> rows = new ArrayList<>();

        rows.add(new Row("Mercedes", "CLE 200", 227));
        rows.add(new Row("Mercedes", "EQE AMG", 625));
        rows.add(new Row("Mercedes", "GLS 450", 227));
        rows.add(new Row("Mercedes", "A 180", 150));
        rows.add(new Row("Mercedes", "C 63 S E", 680));
        rows.add(new Row("Mercedes", "E 200", 227));
        rows.add(new Row("Volkswagen VW", "Passat", 150));
        rows.add(new Row("Volkswagen VW", "Up", 75));
        rows.add(new Row("Audi", "Q8 e-tron", 340));
        rows.add(new Row("Audi", "A5", 150));
        rows.add(new Row("Audi", "A4", 150));
        rows.add(new Row("Audi", "RS 6", 600));
        rows.add(new Row("Audi", "A7", 286));
        rows.add(new Row("BMW", "i5", 340));
        rows.add(new Row("BMW", "X6", 298));
        rows.add(new Row("BMW", "420I", 184));
        rows.add(new Row("Cupra", "Born", 204));
        rows.add(new Row("Ford", "Focus", 100));
        rows.add(new Row("Volvo", "v60", 203));
        rows.add(new Row("Mercedes", "Maybach S 680", 612));

        ArrayList<AggregatedRow> sortedList = sorter.sort(aggregator.aggregate(rows));

        for(int i = 0; i < sortedList.size(); i++){
            System.out.println(i + 1 + ". " + sortedList.get(i).brand + " " + sortedList.get(i).modell + " " + sortedList.get(i).hp +"hp");
        }
    }
}
