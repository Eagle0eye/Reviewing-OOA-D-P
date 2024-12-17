package org.DesignPatterns.Behavioural.ChainOfResponsability;


public class Request {

    RequestType requestType;
    double amount;
    public Request(RequestType requestType, double amount){
        this.requestType=requestType;
        this.amount=amount;
    }
    public RequestType getRequestType() {
        return requestType;
    }
    public double getAmount() {
        return amount;
    }
}
