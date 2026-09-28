package week6inheritance;

public class GameItem{
    private double xLoc;
    private double yLoc;

    public GameItem(double x,double y){
        this.xLoc=x;
        this.yLoc=y;
    }
    public double getX(){
        return this.xLoc;
    }
    public double getY(){
        return this.yLoc;
    }
}