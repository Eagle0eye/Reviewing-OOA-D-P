package org.DesignPatterns.Behavioural.ChainOfResponsability;


public class CodeRunner {
    public static void main(String[] args) {
        Director bryan =new Director();
        VP crystal = new VP();
        CEO jeff =new CEO();

        bryan.setSuccessor(Actors.VP);
        crystal.setSuccessor(Actors.CEO);

        Request r1 = new Request(RequestType.CONFERENCE,500.0);
        bryan.handelRequest(r1);

        Request r2 = new Request(RequestType.PURCHASE,1200.0);
        bryan.handelRequest(r2);

        Request r3 = new Request(RequestType.PURCHASE,2000.0);
        bryan.handelRequest(r3);


    }
}