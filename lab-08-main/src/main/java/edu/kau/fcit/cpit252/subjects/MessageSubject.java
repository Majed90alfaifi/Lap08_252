package edu.kau.fcit.cpit252.subjects;
 
import edu.kau.fcit.cpit252.observers.Observer;

import java.util.*;


public class MessageSubject implements Subject {

    List <Observer> observers = new ArrayList<>();


    @Override
    public void subscribe(Observer o) {
        //add
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        //remove
        observers.remove(o);

    }

    @Override
    public void notifyUpdate(String m) {
        observers.notify();
    }
}
