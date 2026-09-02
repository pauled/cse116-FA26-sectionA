package week2;

import java.util.HashMap;

public class HashMap1{

    public static void main(String[] args) {
        HashMap<String,Integer> bills=new HashMap<>();
        bills.put("Allen",17);
        bills.put("Cooke",4);

        for (String name : bills.keySet()){
            System.out.println(name);
        }
        for (Integer num : bills.values()){
            System.out.println(num);
        }
        for (String key : bills.keySet()){
            System.out.println(key+"'s number is: "+bills.get(key));
        }
    }
}