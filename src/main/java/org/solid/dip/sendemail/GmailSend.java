package org.solid.dip.sendemail;

public class GmailSend extends IMessage {
    @Override
    public void send() {
        System.out.println("Gmail");
    }
}
