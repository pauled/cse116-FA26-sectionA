package week12;

public class BubbleSort{
    private static int count=0;

    public void resetCount(){
        this.count=0;
    }
    public int getCount(){
        return this.count;
    }

    public int[] bubbleSort1(int[] valsIn){
        int[] vals=new int[valsIn.length];
        this.count+=3;
        for (int x=0;x<valsIn.length;x++){
            vals[x]=valsIn[x];
            this.count+=5;
        }
        this.count+=3;

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

    public  int[] bubbleSort2(int[] valsIn){
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
    public  int[] bubbleSort3(int[] valsIn){
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