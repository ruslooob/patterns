package com.ruslooob.behavioral.chain_of_responsibility;

public abstract class Notifier {
    private final LevelPriority priority;
    private Notifier nextNotifier;

     public Notifier(LevelPriority priority) {
        this.priority = priority;
     }

    public void setNestNotifier(Notifier notifier) {
        this.nextNotifier = notifier;
    }

    public void notify(String message, LevelPriority level) {
        if (level.ordinal() >= priority.ordinal()) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notify(message, level);
        }
    }

    public abstract void write(String message);
}
