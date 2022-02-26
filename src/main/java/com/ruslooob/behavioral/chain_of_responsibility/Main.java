package com.ruslooob.behavioral.chain_of_responsibility;

public class Main {

    public static void main(String[] args) {
        Notifier simpleRepostNotifier = new SimpleReportNotifier(LevelPriority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(LevelPriority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(LevelPriority.ASAP);
        simpleRepostNotifier.setNestNotifier(emailNotifier);
        emailNotifier.setNestNotifier(smsNotifier);

        simpleRepostNotifier.notify("Daily report", LevelPriority.ROUTINE);
        simpleRepostNotifier.notify("New Bug!", LevelPriority.IMPORTANT);
        simpleRepostNotifier.notify("!!!CLUSTER WAS FALLEN!!!", LevelPriority.ASAP);
    }

}
