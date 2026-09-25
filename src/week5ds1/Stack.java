package week5ds1;

public class Stack<T>{
    private LLN<T> head;

    public Stack(){
        this.head=null;
    }

    public void push(T value){
        LLN<T> temp=new LLN<T>(value,this.head);
        this.head=temp;
    }

    public T pop(){
        if (this.head==null){
            return null;
        }
        T temp=this.head.getValue();
        this.head=this.head.getNext();
        return temp;
    }
    public String toString(){
        return this.head.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}