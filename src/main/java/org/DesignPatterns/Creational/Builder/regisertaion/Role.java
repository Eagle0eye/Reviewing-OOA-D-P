package org.DesignPatterns.Creational.Builder.regisertaion;

public enum Role {
    STAFF,SUPERVISOR;

    @Override
    public String toString() {
        switch (this){
            case STAFF:
                return "staff";
            case SUPERVISOR:
                return "supervisor";
            default: return "role";
        }

    }
}
