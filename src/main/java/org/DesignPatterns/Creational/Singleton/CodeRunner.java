package org.DesignPatterns.Creational.Singleton;

public class CodeRunner {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);

        Singleton another_instance = Singleton.getInstance();
        System.out.println(another_instance);
    }

}
