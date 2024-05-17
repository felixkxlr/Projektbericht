package Projektbericht.Implementierung;

import java.util.ArrayList;

public class Sorter {

    public ArrayList<AggregatedRow> mergeSort(ArrayList<AggregatedRow> rows) {
        int length = rows.size();
        if (length < 2) {
            return rows;
        }
    
        int middleIndex = length / 2;
        ArrayList<AggregatedRow> leftSide = new ArrayList<>(rows.subList(0, middleIndex));
        ArrayList<AggregatedRow> rightSide = new ArrayList<>(rows.subList(middleIndex, length));
    
        mergeSort(leftSide);
        mergeSort(rightSide);
        merge(rows, leftSide, rightSide);
    
        return rows;
    }
    
    public void merge(ArrayList<AggregatedRow> rows, ArrayList<AggregatedRow> leftSite, ArrayList<AggregatedRow> rightSide) {
        int leftIndex = 0;
        int rightIndex = 0;
        int index = 0;
        int leftSize = leftSite.size();
        int rightSize = rightSide.size();
    
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftSite.get(leftIndex).hp <= rightSide.get(rightIndex).hp) {
                rows.set(index, rightSide.get(rightIndex));
                rightIndex++;
            } else {
                rows.set(index, leftSite.get(leftIndex));
                leftIndex++;
            }
            index++;
        }
    
        while (leftIndex < leftSize) {
            rows.set(index, leftSite.get(leftIndex));
            leftIndex++;
            index++;
        }
    
        while (rightIndex < rightSize) {
            rows.set(index, rightSide.get(rightIndex));
            rightIndex++;
            index++;
        }
    }

    public ArrayList<AggregatedRow> sort(ArrayList<AggregatedRow> rows){
        return mergeSort(rows);
    }
}