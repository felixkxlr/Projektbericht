package Projektbericht.Implementierung;

import java.util.ArrayList;

public class Aggregator {

    public ArrayList<AggregatedRow> aggregatedRows;
    
    public Aggregator(){
        this.aggregatedRows = new ArrayList<>();
    }

    public ArrayList<AggregatedRow> aggregate (ArrayList<Row> rows){

        for (String brand : getBrands(rows)) {
            aggregatedRows.add(new AggregatedRow(brand, null, 0));
        }
        
        for(int i = 0; i < aggregatedRows.size(); i++){
            for (Row row : rows) {
                if (aggregatedRows.get(i).brand == row.brand) {
                    if(aggregatedRows.get(i).hp < row.hp){
                        aggregatedRows.get(i).modell = row.modell;
                        aggregatedRows.get(i).hp = row.hp;
                    }                                      
                }
            }
        }
        return aggregatedRows;
    }

    private ArrayList<String> getBrands(ArrayList<Row> rows){
        ArrayList<String> brands = new ArrayList<>();
         for (Row row : rows) {
            if(brands.contains(row.brand) == false){
                brands.add(row.brand);
            } 
        }
        return brands;
    }
}