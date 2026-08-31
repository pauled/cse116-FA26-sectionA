package week1;

public class Day3{
    public static double multiplyByTwo(double valIn){
        double x=2*valIn;
        return x;
    }
    public static String scoreToLetter(int score){
        int tens=score/10;
        if (tens>=9){
            return "A";
        } else if (tens>=8){
            return "B";
        } else if (tens>=7){
            return "C";
        } else if (tens>=6){
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        System.out.println("hello nurse");
        int x=6;//int are integers and store integers
        x=11;
        //these are single line comments
        /*
        this is how you do a multi
        line comment
        */
       double y=3.2;//doubles are like floats
       String str1="my string";//' can't be used for strings
       boolean true1=false;
       double out=multiplyByTwo(y);

        str1=scoreToLetter(73);
        double val=10;
        while (val>2){
            System.out.println(val);
            val/=2;//val/=2 is val=val/2
        }
        //(run before loop; conditional; incrementor)
        for (x=0; x<4; x++){//x++ is x+=1 is x=x+1
            System.out.println(x);
        }

        for (int z=0; z<3; z++){
            System.out.println(z);
        }
    }
}