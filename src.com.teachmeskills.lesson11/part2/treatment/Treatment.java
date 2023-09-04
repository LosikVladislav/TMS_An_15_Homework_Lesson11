package part2.treatment;

import part2.model.Circle;
import part2.model.Figure;
import part2.model.Rectangle;
import part2.model.Triangle;

import java.util.ArrayList;

public class Treatment {
    public static double getPerimetersSum(ArrayList<Figure> arrayList){
        double sum = 0;
        for(int i = 0; i < arrayList.size(); i++){
            sum += arrayList.get(i).getPerimeter();
        }
        return sum;
    }
    public static void fillArrayList(ArrayList<Figure> arrayList){
        arrayList.add(new Triangle(5.2,2.0,3.6));
        arrayList.add(new Rectangle(10.4,26.3));
        arrayList.add(new Circle(13.4));
    }
}
