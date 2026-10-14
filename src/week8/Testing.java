package week8;

public class Testing{
    public static void main(String[] args) {
        double total=0;
        for (int x=0;x<100;x++){
            total+=.1;
            System.out.println(total);
        }
        double actual=8.999999999999984;
        double expected=9.0;
        System.out.println(Math.abs(actual-expected)<.001);
        String str1="hello";
        String str2="bye";
        String str3=str1+str2;
        String str4="hellobye";
        System.out.println(str3==str4);
    }

}