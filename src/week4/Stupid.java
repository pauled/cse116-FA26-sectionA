package week4;

public class Stupid{
    public static int add(int a, int b){
        if (b==0){
            return a;
        } else if(b>0){
            //int temp=add(a+1,b-1);
            //return temp;
            return add(a+1,b-1);
        } else {
            int temp=add(a-1,b+1);
            return temp;
        }
    }
    public static void main(String[] args) {
        int temp=add(4,4);
        
        int[] nums=new int[3];

        int total=0;
        int total2=0;

        for (int x=0;x<1000;x++){
            for (int y=0;y<1000*x;y++){
                for (int z=0;z<1000000000;z++){
                    for (int i=0;i<nums.length;i++){
                        nums[i]=5;
                        total+=x;
                        total2+=y*z;
                    }
                }
            }
            
        }
    }
}