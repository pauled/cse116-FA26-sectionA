package week10;

public class BubbleSort{
    public static int[] bubbleSort1(int[] valsIn){
        int[] vals=new int[valsIn.length];
        for (int x=0;x<valsIn.length;x++){
            vals[x]=valsIn[x];
        }

        boolean outOfOrder=true;
        //int x=0;
        //while (outOfOrder){
            //outOfOrder=false;
        for (int x=0;x<vals.length;x++){
            for (int y=0;y<vals.length-1;y++){
                if (vals[y]>vals[y+1]){
                    outOfOrder=true;
                    int temp=vals[y];
                    vals[y]=vals[y+1];
                    vals[y+1]=temp;
                }
            }
            //x++;
        }
        return vals;
    }

    public static int[] bubbleSort2(int[] valsIn){
        int[] vals=new int[valsIn.length];
        for (int x=0;x<valsIn.length;x++){
            vals[x]=valsIn[x];
        }

        boolean outOfOrder=true;
        //int x=0;
        //while (outOfOrder){
            //outOfOrder=false;
        for (int x=0;x<vals.length;x++){
            for (int y=0;y<vals.length-x-1;y++){
                if (vals[y]>vals[y+1]){
                    outOfOrder=true;
                    int temp=vals[y];
                    vals[y]=vals[y+1];
                    vals[y+1]=temp;
                }
            }
            //x++;
        }
        return vals;
    }
    public static int[] bubbleSort3(int[] valsIn){
        int[] vals=new int[valsIn.length];
        for (int x=0;x<valsIn.length;x++){
            vals[x]=valsIn[x];
        }

        boolean outOfOrder=true;
        int x=0;
        while (outOfOrder){
            outOfOrder=false;
        //for (int x=0;x<vals.length;x++){
            for (int y=0;y<vals.length-x-1;y++){
                if (vals[y]>vals[y+1]){
                    outOfOrder=true;
                    int temp=vals[y];
                    vals[y]=vals[y+1];
                    vals[y+1]=temp;
                }
            }
            x++;
        }
        return vals;
    }
}