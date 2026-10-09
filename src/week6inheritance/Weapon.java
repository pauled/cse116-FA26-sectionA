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
    public static void main(String[] args) {
        GameItem g1=new GameItem(1.0,2.0);
        String strG1=g1.toString();
        Weapon w1=new Weapon(3,4,5);
        String strW1=w1.toString();
        GameItem g2=(GameItem)w1;
        /*
        Player p1=new Player(10);
        w1.use(p1);
        g2.use(p1);*/
        String strG2=g2.toString();
    }
}