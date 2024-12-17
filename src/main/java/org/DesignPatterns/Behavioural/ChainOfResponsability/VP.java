package org.DesignPatterns.Behavioural.ChainOfResponsability;


public class VP extends Handler{
    @Override
    public void handelRequest(Request request) {
        if (request.requestType==RequestType.PURCHASE)
        {
            if (request.amount<1500)
                System.out.println("VP can Approve amount < 1500");
            else {
                CEO ceo =new CEO();
                ceo.handelRequest(request);
            }
        }

    }
}
