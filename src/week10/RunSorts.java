package week10;

import java.util.ArrayList;
import java.util.Random;

import week7.IntIncreasing;

public class RunSorts{
    public static ArrayList<Integer> randomInts(int size){
        ArrayList<Integer> out=new ArrayList<>();
        Random random=new Random();

        for (int x=0;x<size;x++){
            out.add(random.nextInt());
        }
        return out;
    }
    public static void main(String[] args) {
        MergeSort<Integer> sorter=new MergeSort<>(new IntIncreasing());

        int size=10;
        ArrayList<Integer> randInts=randomInts(size);
        System.out.println(randInts);
        ArrayList<Integer> sorted=sorter.mergeSort(randInts);
        System.out.println(sorted);
    }
}