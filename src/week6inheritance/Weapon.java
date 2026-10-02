package week6inheritance;

public class Weapon extends GameItem implements Usable{
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
    public void use(Player player){
        player.takeDamage((int)this.damage);
    }
    public double getX(){
        return super.getX()+3;
    }
}