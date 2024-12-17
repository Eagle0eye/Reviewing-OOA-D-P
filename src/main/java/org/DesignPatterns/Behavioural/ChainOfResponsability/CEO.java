package org.DesignPatterns.Behavioural.ChainOfResponsability;

public class CEO extends Handler {

    @Override
    public void handelRequest(Request request) {
            System.out.println("CEO can Approve Anything");

    }
}
