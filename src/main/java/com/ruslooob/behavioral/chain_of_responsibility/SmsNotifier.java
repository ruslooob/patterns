package com.ruslooob.behavioral.chain_of_responsibility;

public class SmsNotifier extends Notifier {

    public SmsNotifier(LevelPriority priority) {
        super(priority);
    }

    @Override
    public void notify(String message, LevelPriority level) {
        super.notify(message, level);
    }

    @Override
    public void write(String message) {
        System.out.println("SmsNotifier write message: " + message);
    }

}
