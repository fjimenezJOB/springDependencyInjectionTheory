package com.privalia.sigleton;

public class Singleton {
    private static Singleton instance = null;
    // Objeto helper para bloquear los threds, para el sycronized
    private static Object mutex = new Object();

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null){
            synchronized (mutex){
                if(instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
