package part1.treatment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Treatment {
    public  static ArrayList<Integer> fillList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number to fill. To finish, type 'exit'");
        int order = 0;
        while(true){
            String input = scan.next();
            if(input.toLowerCase().equals("exit")){
                break;
            }try{
                arrayList.add(Integer.parseInt(input));
            }catch (Exception e){
                System.out.println("invalid input format");
            }
            order++;
        }
        return arrayList;
    }
    public static void showArrayList(ArrayList<Integer> array){
        System.out.println(array);
    }
    public static ArrayList<Integer> findEvenNumbers(ArrayList<Integer> arrayList){
        ArrayList<Integer> arrayResult = new ArrayList<>();
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0){
                arrayResult.add(arrayList.get(i));
            }
        }return arrayResult;
    }
}
