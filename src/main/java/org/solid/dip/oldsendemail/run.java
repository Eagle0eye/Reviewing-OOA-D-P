package org.solid.dip.oldsendemail;

import org.solid.dip.sendemail.Message;

public class run {
    public static void main(String[] args)
    {
        Notification notification = new Notification();
        notification.sendGmail();
        notification.sendOutlook();
    }
}
