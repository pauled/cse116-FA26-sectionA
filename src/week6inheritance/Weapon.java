package week6inheritance;

public class Weapon extends GameItem{
    private double damage;

    public Weapon(double x,double y,double damage){
        super(x,y);
        this.damage=damage;
    }
    public double getX(){
        return super.getX()+3;
    }
}