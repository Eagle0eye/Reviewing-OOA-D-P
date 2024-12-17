package org.solid.dip.sendemail;

public class Message {
    public IMessage MailType;

    public void send(){
        MailType.send();
    }

}
