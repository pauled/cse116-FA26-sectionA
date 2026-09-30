package week6inheritance;

public class GameItem{
    protected  double xLoc;
    protected  double yLoc;

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
    public String toString(){
        String out="Location: ("+this.xLoc+", "+this.yLoc+")";
        return out;
    }
}