package week9;

import week7.Comparator;
import week7.IntIncreasing;

public class BST<A>{
    private BTN<A> root;
    private Comparator comparator;

    public BST(Comparator comparator){
        this.comparator=comparator;
        this.root=null;
    }
    public void insert(A value){
        if (this.root==null){
            this.root=new BTN(value,null,null);
        } else {
            insertHelper(this.root,value);
        }
    }
    public void insertHelper(BTN<A> node, A value){
        if (this.comparator.compare(value, node.value)){
            if (node.left==null){
                node.left=new BTN(value,null,null);
            } else {
                insertHelper(node.left, value);
            }
        } else {
            if (node.right==null){
                node.right=new BTN(value,null,null);
            } else {
                insertHelper(node.right, value);
            }
        }
    }
    public String inOrderTraversal(){
        return this.root.inOrderTraversal(root);
    }
    public boolean find(A value){
        if (this.root==null){
            return false;
        } else {
            return findHelper(this.root,value);
        }
    }
    public boolean findHelper(BTN<A> node,A value){
        if (node==null){
            return false;
        } else if(node.value.equals(value)){
            return true;
        } else if (this.comparator.compare(value,node.value)){
            return findHelper(node.left, value);
        } else {
            return findHelper(node.right, value);
        }
    }
    public static void main(String[] args) {
        BST<Integer> tree=new BST(new IntIncreasing());
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(6);
        String out=tree.inOrderTraversal();
        System.out.println(out);
    }
}