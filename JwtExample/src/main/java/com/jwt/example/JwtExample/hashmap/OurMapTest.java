package com.jwt.example.JwtExample.hashmap;

public class OurMapTest {
    public static  void  main(String args[]){
        OurMap<Integer,String> nametoLean = new OurMap<>();
        nametoLean.put(1,"a");
        nametoLean.put(2,"absxd");
        nametoLean.put(3,"abc");
        nametoLean.put(4,"cidd");

        System.out.println(nametoLean.get(4));
    }

}
