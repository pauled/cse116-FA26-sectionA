package week6inheritance;

public class Weapon extends GameItem{
    private double damage;

    public Weapon(double x,double y,double damage){
        super(x,y);
        this.damage=damage;
    }
    public String toString(){
        String out=super.toString();
        out+=" damage: "+this.damage;
        return out;
    }
    public double getX(){
        return super.getX()+3;
    }
}