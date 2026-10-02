package week6inheritance;

import java.util.ArrayList;

public class Player extends GameItem{
    //state, state variables, instance variables, object variables
    private int HP;
    private int maxHP;
    private int damageDealt;
    private ArrayList<Usable> inventory;

    //behaviors
    public Player(int maxHP,double x,double y){
        super(x,y);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
    }
    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    //write a method to have one player attack another
    public void attack(Player other){
        other.takeDamage(this.damageDealt);
    }
    public int getDamageDealth(){
        return this.damageDealt;
    }
    public int getHP(){
        return this.HP;
    }
    public int getMaxHP(){
        return this.maxHP;
    }
    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(8);
        Player p3=p1;
        p3.takeDamage(7);
        p1.attack(p2);
    }
}