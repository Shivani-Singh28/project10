package com.company;

public class InterruptedExp extends Thread {
    public void run(){
        for (int i=1;i<=3;i++){
            System.out.println("task"  +i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        InterruptedExp p1=new InterruptedExp();
        InterruptedExp p2=new InterruptedExp();
        p1.start();
        p2.start();
        System.out.println(p1.isInterrupted());
        System.out.println(p2.isInterrupted());
        p1.interrupt();
        System.out.println(p1.isInterrupted());
        System.out.println(p2.isInterrupted());
    }
}
