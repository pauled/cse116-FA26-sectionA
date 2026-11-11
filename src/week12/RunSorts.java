package week12;

import java.util.ArrayList;
import java.util.Random;

import week10.TimeMe;
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
    public static int[] generateRandoms(int size){
        Random random=new Random();
        int[] out=new int[size];
        for (int x=0;x<size;x++){
            out[x]=random.nextInt();
        }
        return out;
    }
    public static int[] addRandoms(int size,int[] valsIn){
        Random random=new Random();
        int[] out=new int[size+valsIn.length];
        for (int x=0;x<size;x++){
            out[x]=random.nextInt();
        }
        for (int x=0;x<valsIn.length;x++){
            out[x+size]=valsIn[x];
        }
        return out;
    }
    
    public static void printArray(int[] arrayIn){
        String out="";
        for (int x=0;x<arrayIn.length;x++){
            out+=arrayIn[x]+" ";
        }
        System.out.println(out);
    }
    public static ArrayList<Integer> copyArray(int[] arrayIn){
        ArrayList<Integer> arrayOut=new ArrayList<>();
        for (int x=0;x<arrayIn.length;x++){
            arrayOut.add(arrayIn[x]);
        }
        return arrayOut;
    }
    public static void main(String[] args) {
        MergeSort<Integer> sorter=new MergeSort<>(new IntIncreasing());
        TimeMe timer=new TimeMe();

        for (int size=10; size<1000000000;size*=10){
            System.out.println("\nitems:"+size);
            int[] randInts2=generateRandoms(size);
            ArrayList<Integer> randInts=copyArray(randInts2);
            //System.out.println(randInts);
            timer.start();
            ArrayList<Integer> sorted=sorter.mergeSort(randInts);
            timer.lap();
            //System.out.println(sorted);
            System.out.println("mergeSort "+timer);

            timer.start();
            int[] sorted2=MergeSort2.mergeSort(randInts2);
            timer.lap();
            //System.out.println(sorted);
            System.out.println("mergeSort2 "+timer);

            BubbleSort b1=new BubbleSort();
            /*
            timer.start();
            sorted2=b1.bubbleSort1(randInts2);
            timer.lap();
            //System.out.println(sorted);
            System.out.println("bubble1 "+timer);

            timer.start();
            sorted2=b1.bubbleSort2(randInts2);
            timer.lap();
            //System.out.println(sorted);
            System.out.println("bubble2 "+timer);

            timer.start();
            sorted2=b1.bubbleSort3(randInts2);
            timer.lap();
            //System.out.println(sorted);
            System.out.println("bubble3 "+timer);
*/
            int[] randInts3=addRandoms(10, sorted2);
            randInts=copyArray(randInts3);
            //System.out.println(randInts);
            timer.start();
            sorted=sorter.mergeSort(randInts);
            timer.lap();
            //System.out.println(sorted);
            System.out.println("add-mergeSort "+timer);

            timer.start();
            sorted2=MergeSort2.mergeSort(randInts3);
            timer.lap();
            //System.out.println(sorted);
            System.out.println("add-mergeSort2 "+timer);
/*
            timer.start();
            sorted2=b1.bubbleSort1(randInts3);
            timer.lap();
            //System.out.println(sorted);
            System.out.println("add-bubble1 "+timer);

            timer.start();
            sorted2=b1.bubbleSort2(randInts3);
            timer.lap();
            //System.out.println(sorted);
            System.out.println("add-bubble2 "+timer);
*/
            timer.start();
            sorted2=b1.bubbleSort3(randInts3);
            timer.lap();
            //System.out.println(sorted);
            System.out.println("add-bubble3 "+timer);
        }
    }
}