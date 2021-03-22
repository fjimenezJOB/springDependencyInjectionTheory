package com.privalia.sigleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        // Al devolver el mismo hash code significa las dos variables apuntan al mismo objeto
    }
}