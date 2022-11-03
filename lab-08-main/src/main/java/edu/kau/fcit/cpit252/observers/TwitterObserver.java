package edu.kau.fcit.cpit252.observers;

public class TwitterObserver extends Observer{

    public TwitterObserver(String receiver) {
        super(receiver);
    }

    @Override
    public void notify(String message) {
        // send twit
    }
}
