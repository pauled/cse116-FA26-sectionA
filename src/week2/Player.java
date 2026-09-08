package week2;

public class Player{
    //state, state variables, instance variables, object variables
    private int HP;
    private int maxHP;
    private int damageDealt;

    //behaviors
    public Player(int maxHP){
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
    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(8);
        Player p3=p1;
        p3.takeDamage(7);
        p1.attack(p2);
    }
}