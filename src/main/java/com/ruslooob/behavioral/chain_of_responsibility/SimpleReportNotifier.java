package com.ruslooob.behavioral.chain_of_responsibility;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(LevelPriority level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("SimpleRepostNotifier message: " + message);
    }

}
