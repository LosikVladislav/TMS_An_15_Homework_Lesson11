package part2;

import part2.model.Figure;
import part2.treatment.Treatment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> arrayList = new ArrayList<>();
        Treatment.fillArrayList(arrayList);
        System.out.println(Treatment.getPerimetersSum(arrayList));
    }
}
