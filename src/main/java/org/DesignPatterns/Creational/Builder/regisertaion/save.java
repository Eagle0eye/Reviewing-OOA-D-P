package org.DesignPatterns.Creational.Builder.regisertaion;

public class save {
    public static void main(String[] args) {
        User.Information user= new User.Information();
        user.Name("Yousef").Email("Yousef@email.com").Role(Role.SUPERVISOR);
        User saved_user=user.save();

        System.out.println(saved_user.getName());
        System.out.println(saved_user.getEmail());
        System.out.println(saved_user.getRole());
    }
}
