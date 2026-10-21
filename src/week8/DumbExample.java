package week8;

import java.util.ArrayList;
import java.util.Arrays;

public class DumbExample{
    public static int sumHelper(int loc, ArrayList<Integer> nums){
        if (loc==nums.size()){
            return 0;
        } else {
            int temp=nums.get(loc)+sumHelper(loc+1, nums);
            return temp;
        }
    }
    public static int sum(ArrayList<Integer> nums){
        return sumHelper(0, nums);
    }
    public static int sumTailHelper(int total,int loc,ArrayList<Integer> nums){
        if(loc==nums.size()){
            return total;
        } else {
            return sumTailHelper(total+nums.get(loc), loc+1, nums);
        }
    }
    public static int sumTail(ArrayList<Integer> nums){
        return sumTailHelper(0,0,nums);
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        int total=sum(nums);
    }
}