package week2;

import java.util.ArrayList;

public class ArrayList1{
    public static int sum(ArrayList<Integer> arrIn){
        int out=0;
        for (int x=0; x<arrIn.size(); x++){
            out+=arrIn.get(x);
        }
        return out;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int x=0; x<3; x++){
            arr1.add(x*2);
        }
        int temp=sum(arr1);
    }
}