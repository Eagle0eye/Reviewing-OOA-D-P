package org.DesignPatterns.Creational.Builder.EmailService;

public class Request {
    public static void main(String[] args) {
        Email.EmailBuilder user=new Email.EmailBuilder("Google","Yousef@gmail.com");


        user.addRecipient("MIS").addAttachment("file.pdf").Body("Msr");
        Email email1 =user.request();
        System.out.println("Email 1: " + email1.getSubject() + ", " + email1.getSender());
        System.out.println("Recipients: " + email1.getRecipients());
        System.out.println("Body: " + email1.getBody());
        System.out.println("Attachments: " + email1.getAttachments());

    }
}
