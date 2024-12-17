package org.DesignPatterns.Creational.Builder.regisertaion;

public class User {
    private final String name;
    private final String email;
    private final Role role;

    public static class Information
    {
        private String name;
        private String email;
        private Role role;

        public Information Name(String name) {
            this.name = name;
            return this;
        }

        public Information Email(String email) {
            this.email = email;
            return this;
        }

        public Information Role(Role role) {
            this.role = role;
            return this;
        }

        public Information(){}

        public User save(){
            return new User(this);
        }

    }
    public User(Information info){
        this.name=info.name;
        this.email=info.email;
        this.role=info.role;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Role getRole() {
        return role;
    }
}
