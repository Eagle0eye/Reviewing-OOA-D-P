package org.solid.dip.oldsendemail;

public class Outlook {
    private String address;
    private String from ;

    private  String to_address;
    public Outlook(){
        address= "Address ";
        from = "from ";
        to_address="to address";
    }
    public void send(){
        System.out.println("outlook");
        System.out.println(address+from+to_address);
    };
}
