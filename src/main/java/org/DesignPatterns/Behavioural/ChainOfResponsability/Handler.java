package org.DesignPatterns.Behavioural.ChainOfResponsability;

public abstract class Handler {

    private Actors successor =null;

    public void setSuccessor(Actors successor) {
        this.successor = successor;
    }
    public abstract void handelRequest(Request request);

}
