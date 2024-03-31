package com.jwt.example.JwtExample.Assement;

import java.awt.*;

 class MyThread  extends Thread{
    public void run(){
        for (int i =0; i<5 ;i++){
            System.out.println(("Thread Running "+ i));
            try{
                Thread.sleep(1000);
            }catch (InterruptedException exception){
                System.out.println("Thread Interrupted");
            }
        }
    }
}
 public  class Main{
     public  static  void Main(String[] args){
         MyThread thread = new MyThread();

         thread.start();
     }

 }