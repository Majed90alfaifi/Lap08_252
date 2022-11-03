package edu.kau.fcit.cpit252.observers;

public abstract class Observer {

    protected String receiver;
    public Observer (String receiver ){
        this.receiver=receiver;
    };

    public abstract void notify(String message);
}
