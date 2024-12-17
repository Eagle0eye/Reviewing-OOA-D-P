package org.solid.dip.oldsendemail;

public class Gmail {
    private String address;
    private String from ;

    private  String to_address;
    public Gmail(){
        address= "address ";
        from = "from ";
        to_address="to address";
    }


    public void send(){

        System.out.println("Gmail");
        System.out.println(address+from+to_address);
    }
}
