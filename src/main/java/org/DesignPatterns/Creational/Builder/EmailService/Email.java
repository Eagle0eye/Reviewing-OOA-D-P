package org.DesignPatterns.Creational.Builder.EmailService;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private final String subject;
    private final String sender;
    private final List<String> recipients;
    private final String body;
    private final List<String> attachments;
    public static class EmailBuilder{
        private String subject;
        private String sender;
        private List<String> recipients = new ArrayList<>();
        private String body;
        private List<String> attachments = new ArrayList<>();
        public EmailBuilder(String subject,String sender)
        {
            this.sender=sender;
            this.subject=subject;
        }
        public Email request(){
            return new Email(this);
        }
        public EmailBuilder addRecipient(String recipient) {
            this.recipients.add(recipient);
            return this;
        }
        public EmailBuilder addAttachment(String attachment) {
            this.attachments.add(attachment);
            return this;
        }


        public EmailBuilder Recipients(List<String> recipients) {
            this.recipients = recipients;
            return this;
        }

        public EmailBuilder Body(String body) {
            this.body = body;
            return this;
        }

        public EmailBuilder Attachments(List<String> attachments) {
            this.attachments = attachments;
            return this;
        }



    }
    public Email(EmailBuilder builder){
        this.sender=builder.sender;
        this.subject=builder.subject;
        this.recipients=builder.recipients;
        this.body=builder.body;
        this.attachments=builder.attachments;
    }
    public String getSubject() {
        return subject;
    }

    public String getSender() {
        return sender;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public String getBody() {
        return body;
    }

    public List<String> getAttachments() {
        return attachments;
    }
}
