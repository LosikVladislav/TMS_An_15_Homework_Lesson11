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

    public static int getData(String str){
        if(checkValid(str)){
            int size = Integer.parseInt(str);
            return size;
        }else{
            System.out.println("Input error. Restart application and enter data correctly");
            System.exit(0);
        }
        return 0;
    }

    public static ArrayList<Integer> createArrayList(){
        System.out.println("enter size");
        String str = createScanner();
        int size = getData(str);
        if(size == 0){
            System.out.println("size of arrayList can not be 0. Please restar application and enter data correctly");
            System.exit(0);
        }
        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.println("enter num");
        for(int i = 0; i < size; i++){
            String str1 = createScanner();
            int num = getData(str1);
            list.add(num);
        }
        return list;
    }
}


