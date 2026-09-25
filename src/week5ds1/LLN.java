package week5ds1;

public class LLN<G>{
    private G value;
    private LLN next;

    public LLN(G value,LLN next){
        this.next=next;
        this.value=value;
    }
    public G getValue(){
        return this.value;
    }/*
    public String toString(){
        LLN current=this;
        String out="";
        while (current!=null){
            out+=current.getValue()+" ";
            current=current.next;
        }
        return out;
    }*/
    public String toString(){
        if (this.next==null){
            return this.value+"";
        } else {
            String temp=this.value+" ";
            temp+=this.next.toString();
            return temp;
        }
    }
    public boolean find(G toFind){
        if (toFind.equals(this.value)){
            return true;
        } else if(this.next==null){
            return false;
        } else {
            return this.next.find(toFind);
        }
    }
    public void append(G value){
        if (this.next==null){
            this.next=new LLN(value,null);
        } else {
            this.next.append(value);
        }
    }
    public void insert(G value,int loc){
        if (loc==0){
            this.next=new LLN(this.value,this.next);
            this.value=value;
        } else {
            this.next.insert(value, loc-1);
        }
    }
    public LLN<G> getNext(){
        return this.next;
    }
    public void setNext(LLN<G> next){
        this.next=next;
    }
    public static void main(String[] args) {
        LLN<Integer> head=new LLN(1,null);
        //LLN tail=head;
        head=new LLN(2,head);
        head=new LLN(3,head);
        System.out.println(head);
    }
}