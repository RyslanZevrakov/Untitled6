package org.example;

public class DataLoyler {
    Runnable load = () -> {
        for (int i = 0; i<11;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Loading..." + i+10+"%");
        }
    };
    public void showResults(){
        System.out.println("Data has been downloaded. ");
    }
}
