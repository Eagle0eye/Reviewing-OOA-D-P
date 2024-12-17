package org.solid.dip.sendemail;

import org.solid.dip.oldsendemail.Gmail;
import org.solid.lsp.post.*;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args)
    {

        Message message = new Message();
        message.MailType = new GmailSend();
        message.send();
    }
}
