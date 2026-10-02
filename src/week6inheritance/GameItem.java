package week6inheritance;

public abstract class GameItem{
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
    public void move(double dx,double dy){
        this.xLoc+=dx;
        this.yLoc+=dy;
    }
    public String toString(){
        String out="Location: ("+this.xLoc+", "+this.yLoc+")";
        return out;
    }
}