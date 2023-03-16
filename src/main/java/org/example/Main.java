package org.example;
import java.lang.Thread;
public class Main {
    public static void main(String[] args) throws InterruptedException {
DataLoyler dataLoyler = new DataLoyler();
BrekKointer brekKointer = new BrekKointer();
Thread thread = new Thread(dataLoyler.load);
Thread secondThread = new Thread(brekKointer.breakPoint);
thread.start();
secondThread.start();
thread.join();
dataLoyler.showResults();
    }
}