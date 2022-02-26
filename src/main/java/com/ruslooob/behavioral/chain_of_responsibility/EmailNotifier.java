package com.ruslooob.behavioral.chain_of_responsibility;

public class EmailNotifier extends Notifier{

    public EmailNotifier(LevelPriority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("EmailNotifier write message: " + message);
    }

}
