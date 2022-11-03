package edu.kau.fcit.cpit252.observers;

import edu.kau.fcit.cpit252.utils.SendEmail;

public class EmailObserver extends Observer{

    public EmailObserver(String receiver) {
        super(receiver);
    }

    @Override
    public void notify(String message) {
       // SendEmail.send("The Subject",message,super.receiver);
    }
}
