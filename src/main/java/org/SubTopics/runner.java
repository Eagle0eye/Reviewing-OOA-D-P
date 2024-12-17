package org.SubTopics;

public class runner {
    public static void main(String[] args) {
    Valotile Parent=new Valotile(5);

    Thread th1=new Thread(Parent::AddNum5);
    Thread th2=new Thread(Parent::AddNum10);

    th1.start();
    th2.start();



    }
}
