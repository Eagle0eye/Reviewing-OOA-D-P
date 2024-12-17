package org.DesignPatterns.Behavioural.ChainOfResponsability;

public class Director extends  Handler{

    @Override
    public void handelRequest(Request request) {
        if (request.requestType==RequestType.CONFERENCE)
        {
            System.out.println("Director can Approve conference");
        }
        else {
            VP vp = new VP();
            vp.handelRequest(request);
        }
    }
}
