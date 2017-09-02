package patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacacies("First Java Position");
        jobSite.addVacacies("Second Java Position");


        Observer firstSubscriber = new Subscriber("Ivan Alekseev");
        Observer secondSubscriber = new Subscriber("Vika Alekseeva");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacacies("Third Java Position");
    }
}
