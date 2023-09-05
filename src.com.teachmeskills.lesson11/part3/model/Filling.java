package part3.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Filling {
    public static String createScanner(){
        Scanner scan = new Scanner(System.in);
        String empt = scan.next();
        return empt;
    }
    public static boolean checkValid(String str){
        return (str.matches("\\d+"));
    }

    public static int getSize(String str){
        if(checkValid(str)){
            int size = Integer.parseInt(str);
            return size;
        }
        return 0;
    }

    public static ArrayList<Integer> createArrayList(){
        System.out.println("enter size");
        String str = createScanner();
        int size = getSize(str);
        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.println("enter num");
        for(int i = 0; i < size; i++){
            String str1 = createScanner();
            int num = getSize(str1);
            list.add(num);
        }
        return list;
    }
}


