package part3.treatment;

import java.util.ArrayList;

public class Treatment {
    public static double getAVG(ArrayList<Integer> list){
        double sum = 0;
        for(int i =0; i < list.size(); i++){
            sum += list.get(i);
        }
        double avg = sum/ list.size();
        return avg;
    }

}
