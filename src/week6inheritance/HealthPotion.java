package week6inheritance;

public class HealthPotion extends GameItem implements Usable{
    private int increase;

    public HealthPotion(double x,double y,int inc){
        super(x,y);
        this.increase=inc;
    }
    public void use(Player player){
        player.takeDamage(-this.increase);
    }
    public String toString(){
        String out=super.toString();
        out+=" increase: "+this.increase;
        return out;
    }
    public static void main(String[] args) {
        HealthPotion hp1=new HealthPotion(1,2,3);
        double x=hp1.getX();
        System.out.println(x);
        Weapon w1=new Weapon(4,5,6);
        String temp=hp1.toString();
        System.out.println(temp);
        System.out.println(w1);
        w1.move(2,2);
        hp1.move(1, 1);
    }
}