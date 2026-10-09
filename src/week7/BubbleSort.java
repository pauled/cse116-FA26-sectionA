package week7;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort<T>{
    private Comparator<T> comparator;

    public BubbleSort(Comparator<T> comparator){
        this.comparator=comparator;
    }
    public ArrayList<T> sort(ArrayList<T> input){
        ArrayList<T> output=new ArrayList<>();
        for (T value : input){
            output.add(value);
        }
        for (int y=0;y<output.size();y++){
            for (int x=0;x<input.size()-1;x++){
                if (this.comparator.compare(output.get(x+1),output.get(x))){
                    T temp=output.get(x);
                    output.set(x, output.get(x+1));
                    output.set(x+1, temp);
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Comparator<Integer> temp=new IntDecreasing();
        BubbleSort<Integer> sorter=new BubbleSort<>(temp);
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,6,5));
        ArrayList<Integer> output=sorter.sort(list);
        System.out.println(output);

        temp=new IntIncreasing();
        sorter=new BubbleSort<>(temp);
        output=sorter.sort(list);
        System.out.println(output);
    }
}