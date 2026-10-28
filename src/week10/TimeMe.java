package week10;

public class TimeMe{
    private long start;
    private long end;

    public TimeMe(){
        this.start=0;
        this.end=0;
    }
    public void start(){
        this.start=System.currentTimeMillis();
    }
    public void lap(){
        this.end=System.currentTimeMillis();
    }
    public String toString(){
        int dif=(int)(this.end-this.start);
        int milliSeconds=dif%1000;
        int totalSeconds=dif/1000;
        int seconds=
        int minutes=
        int hours=totalSeconds/(60*60);
    }
}