package ru.mirea.pr6;
import java.util.Comparator;
import java.util.Arrays;
public class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        return o1.getGrade()-o2.getGrade();
    }
    public void quickSort(Student source[], int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student p = source[(leftMarker + rightMarker) / 2];
        do {
            while (compare(source[leftMarker],p) <0){
                leftMarker++;
            }
            while (compare(source[rightMarker],p)>0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
}
