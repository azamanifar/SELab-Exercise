package observer;

import java.util.LinkedList;

public class Progress {

    LinkedList<IObserver> observers = new LinkedList<>();
    int progress = 0;

    public Progress() {
    }

    public void increment() {
        if (progress<100) {
            if (progress <= 99)
                progress += 1;
            else
                progress = 100;
            // TODO: I want to notify all observers when a progress has been made
            // notifyObservers();
        }
    }

    //TODO: Implement a mechanism for observers to register

}
