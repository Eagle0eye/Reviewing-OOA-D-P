package org.SubTopics;

public class Valotile {
    static volatile int variable=0;
    Valotile(int number){
        variable=number;
    }
    public void AddNum5(){
        variable = variable + 5;
        System.out.printf("after Add 5 = %d%n",(variable));
    }
    public void AddNum10(){
        System.out.printf("after Add 10 = %d%n",(variable+10));
    }
    public void getvar(){
        System.out.println(variable);
    }
}
