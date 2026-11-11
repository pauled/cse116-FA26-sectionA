package week12;

public class StaticExample2{
    private static int count=0;

    public StaticExample2(){
    }
    public StaticExample2(int val){
        this.count=val;
    }

    public int getCount(){
        return this.count;
    }

    public void addCount(){
        this.count++;
    }
    public static void main(String[] args) {
        StaticExample2 s1=new StaticExample2();
        StaticExample2 s2=new StaticExample2();
        StaticExample2 s3=new StaticExample2();
        StaticExample2 s4=new StaticExample2();

        s1.addCount();
        s2.addCount();
        s3.addCount();
        s4.addCount();
        System.out.println("s1 count: "+s1.getCount());
        StaticExample2 s5=new StaticExample2();
        System.out.println("s1 count: "+s1.getCount());
    }
}