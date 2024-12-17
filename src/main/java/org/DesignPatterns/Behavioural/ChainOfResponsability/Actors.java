package org.DesignPatterns.Behavioural.ChainOfResponsability;

public enum  Actors {
    DIRECTOR, CEO ,VP;

    @Override
    public String toString() {
        switch (this)
        {
            case DIRECTOR: return "Director";
            case VP: return "VP";
            case CEO: return "CEO";
            default: return null;
        }
    }
}
