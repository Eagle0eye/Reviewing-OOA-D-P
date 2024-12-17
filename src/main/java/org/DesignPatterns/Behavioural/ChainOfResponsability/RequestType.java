package org.DesignPatterns.Behavioural.ChainOfResponsability;


public enum RequestType {
    CONFERENCE, PURCHASE;

    @Override
    public java.lang.String toString() {
        switch (this)
        {
            case CONFERENCE:return "Conference";
            case PURCHASE: return "Purchase";
        }
        return null;
    }
}
