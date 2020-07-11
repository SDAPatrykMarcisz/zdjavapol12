package pl.marcisz.patryk.sda.zdjavapol12.streams.sameNamesOfClass;

import pl.marcisz.patryk.sda.zdjavapol12.streams.sameNamesOfClass.ex1.SimpleClass;

public class Main {
    public static void main(String[] args) {
        pl.marcisz.patryk.sda.zdjavapol12.streams.sameNamesOfClass.ex1.SimpleClass simpleClass1 = new pl.marcisz.patryk.sda.zdjavapol12.streams.sameNamesOfClass.ex1.SimpleClass();
        pl.marcisz.patryk.sda.zdjavapol12.streams.sameNamesOfClass.ex2.SimpleClass simpleClass2 = new pl.marcisz.patryk.sda.zdjavapol12.streams.sameNamesOfClass.ex2.SimpleClass();

        SimpleClass classs = new SimpleClass();

        MyThread myThread = new MyThread();
        myThread.start();
        Thread thread = new Thread(new MyThread2());
        thread.start();

    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("jestem w nowym watku #");

        }
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("jestem w nowym watku ##");
        }
    }
}
