package patterns.behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.RUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASSOUT);


        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifierManagment("Everything ws Ok", Priority.RUTINE);
        reportNotifier.notifierManagment("Something went wrong", Priority.IMPORTANT);
        reportNotifier.notifierManagment("Houston, we have a problem", Priority.ASSOUT);
    }
}
