package week10;

import java.util.ArrayList;

import week7.Comparator;

public class MergeSort<A>{
    private Comparator comparator;

    public MergeSort(Comparator compare){
        this.comparator=compare;
    }
    public ArrayList<A> mergeSort(ArrayList<A> data){
        if (data.size()==1){
            return data;
        } else {
            ArrayList<A> half1=new ArrayList<>();
            ArrayList<A> half2=new ArrayList<>();
            for (int x=0; x<data.size()/2; x++){
                half1.add(data.get(x));
            }
            for (int x=data.size()/2; x<data.size(); x++){
                half2.add(data.get(x));
            }
            ArrayList<A> sorted1=mergeSort(half1);
            ArrayList<A> sorted2=mergeSort(half2);
            ArrayList<A> out=combine(sorted1,sorted2);
            return out;
        }
    }
    public ArrayList<A> combine(ArrayList<A> half1,ArrayList<A> half2){
        
    }
}