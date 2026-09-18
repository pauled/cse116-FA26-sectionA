package week4;

public class ArrayList2{
    int[] vals;
    int size;

    //constructor
    public ArrayList2(){
        this.vals=new int[3];
        this.size=0;
    }
    //getValue that takes an index to return
    public int getValue(int index){
        if (index>=0 && index<this.size){
            return this.vals[index];
        }
        return -1;
    }
    public void setValue(int index, int value){
        if (index>=0 && index<this.size){
            this.vals[index]=value;
        }
    }
    //setValue that takes an (index) to place a (value) at
    public void append(int value){
        if (this.size>=this.vals.length){
            int[] temp=new int[this.vals.length*2];
            for (int x=0;x<this.vals.length;x++){
                temp[x]=this.vals[x];
            }
            this.vals=temp;
        }
        this.vals[size]=value;
        this.size++;
    }
    //append that take a value to add
    public static void main(String[] args) {
        int[] nums=new int[3];

        nums[0]=1;
        nums[1]=2;
        nums[2]=4;

        ArrayList2 arr=new ArrayList2();
        arr.append(2);
        arr.append(4);
        arr.append(6);
        arr.append(8);
        System.out.println(arr);
    }
}