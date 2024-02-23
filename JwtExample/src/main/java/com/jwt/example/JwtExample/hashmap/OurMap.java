package com.jwt.example.JwtExample.hashmap;

import java.util.ArrayList;
import java.util.List;

public class OurMap<K,V> {
    //mapNode is nothing but a node of the linked list
    private List<MapNode<K,V>> bucket;
    private int capacity; // lenght of the bucket
    private  int size ; // number of element in the map
    private final int INITAIL_CAPACITY = 5; //initial lenght of the bucket array

   public  OurMap(){
       bucket = new ArrayList<>();
       capacity = INITAIL_CAPACITY;
       for(int i =0; i< capacity; i++){
           bucket.add(null);
       }
   }
   private int getBucketIndex(K key){
       // returns memory address of the object
       int hashcode = key.hashCode();
       return  hashcode % capacity;
   }
   public V get(K key){
       int bucketIndex = getBucketIndex(key);
       MapNode<K,V> head = bucket.get(bucketIndex);
       while (head !=null){
           if(head.key.equals(key)){
               return head.value;
           }
           head = head.next;
       }
       return  null;


   }
   public void put(K key, V value){
       int bucketIndex = getBucketIndex(key);
       MapNode<K,V> head = bucket.get(bucketIndex);
       while (head !=null){
           if(head.key.equals(key)){
               head.value = value;
               return ;
           }
           head = head.next;
       }
       // if the entry is not there in the list
       // we create a new entry and add it the list
       size ++;
       MapNode<K,V> newEntry = new MapNode<K,V>(key, value);
       head = bucket.get(bucketIndex);
       newEntry.next = head;
       bucket.set(bucketIndex,newEntry);

       double loadFactor = (1.0 *size)/capacity;
       if(loadFactor>0.7){
           rehash();
       }
   }
   private void  rehash(){
       List<MapNode<K,V>> temp = bucket;
       bucket = new ArrayList<>();
       capacity *=2;
       for( int i = 0; i<capacity; i++){
           bucket.add(null);
       }
       size =0;
       for (int i =0 ; i<temp.size();i++){
           MapNode<K,V> head = temp.get(i);
           while(head!= null){
               put(head.key,head.value);
               head = head.next;
           }

       }

   }
   public  void  remove(K key){
       //similar to removing node from linkedlist
       int bucketIndex = getBucketIndex(key);
       MapNode<K,V> head = bucket.get(bucketIndex);
       MapNode<K,V> prev = null;
       while(head != null){
           if(head.key.equals(key)){
               if(prev == null){
                   bucket.set(bucketIndex,head.next);
               }
               head.next = null;
               size --;
               break;
           }
           prev = head;
           head = head.next;
       }

   }
    private class  MapNode<K,V> {
        K key;
        V value;
        MapNode<K,V> next;

        public MapNode(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
