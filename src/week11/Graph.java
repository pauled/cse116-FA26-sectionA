package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N>{
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addNode(N a){
        if (!this.adjacencyList.containsKey(a)){
            this.adjacencyList.put(a, new ArrayList<>());
        }
    }
    public void addEdge(N from, N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    public String toString(){
        return this.adjacencyList.toString();
    }
    public boolean isValidPath(ArrayList<N> path){
        
    }
    public static void main(String[] args) {
        Graph<String> map=new Graph();
        map.addEdge("LAX", "LGA");
        map.addEdge("BUF", "LGA");
        map.addEdge("NRT", "LGA");
        map.addEdge("BUF", "LAX");
        map.addEdge("LGA", "LAX");
        map.addEdge("EWR", "LAX");
        map.addEdge("NRT", "LAX");
        map.addEdge("EWR", "NRT");
        map.addEdge("LGA", "EWR");
        map.addEdge("LGA", "BUF");
        map.addEdge("EWR", "BUF");
        System.out.println(map);

        ArrayList<String> path1=new ArrayList<>(
            Arrays.asList("BUF","LAX","LGA","EWR")
        );
        System.out.println(map.isValidPath(path1));
    }
}