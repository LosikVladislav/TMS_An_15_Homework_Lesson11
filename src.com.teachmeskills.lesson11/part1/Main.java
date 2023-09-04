package part1;

import part1.treatment.Treatment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = Treatment.fillList();
        Treatment.showArrayList(arrayList);
        ArrayList<Integer> arrayResult =Treatment.findEvenNumbers(arrayList);
        Treatment.showArrayList(arrayResult);
    }
}
