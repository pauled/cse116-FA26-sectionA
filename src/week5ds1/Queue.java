package week5ds1;

public class Queue<A>{
    private LLN<A> head;
    private LLN<A> tail;

    public Queue(){
        this.head=null;
        this.tail=null;
    }

    public void enqueue(A value){
        if(this.tail==null){
            this.tail=new LLN<A>(value,null);
            this.head=this.tail;
        } else {
            this.tail.setNext(new LLN<A>(value,null));
            this.tail=this.tail.getNext();
        }
    }

    public A dequeue(){
        if (this.head==null){
            return null;
        }
        A outValue=this.head.getValue();
        this.head=this.head.getNext();
        if (this.head==null){
            this.tail=null;
        }
        return outValue;
    }
}