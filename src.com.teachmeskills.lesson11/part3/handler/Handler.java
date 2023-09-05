package part3.handler;

import part3.model.Filling;
import part3.treatment.Treatment;

import java.util.ArrayList;

public class Handler {
    public static void toSolveTask(){
        ArrayList<Integer> list = Filling.createArrayList();
        System.out.println("Average of array list  " + Treatment.getAVG(list));
    }
}
