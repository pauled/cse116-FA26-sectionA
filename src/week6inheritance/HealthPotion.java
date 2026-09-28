package week6inheritance;

public class HealthPotion extends GameItem{
    private int increase;

    public HealthPotion(double x,double y,int inc){
        super(x,y);
        this.increase=inc;
    }
    public static void main(String[] args) {
        HealthPotion hp1=new HealthPotion(1,2,3);
        double x=hp1.getX();
        System.out.println(x);
    }
}