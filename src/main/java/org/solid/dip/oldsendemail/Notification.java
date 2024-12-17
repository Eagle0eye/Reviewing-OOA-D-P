package org.solid.dip.oldsendemail;

public class Notification {
    private Gmail _gmail;
    private Outlook _outlook;
    public Notification(){
        _gmail = new Gmail();
        _outlook = new Outlook();
    }

    public void sendGmail(){this._gmail.send();}
    public void sendOutlook(){
        this._outlook.send();
    }
}
