package backend.concretestate;

import backend.context.User;
import backend.state.UserState;

public class SleepState implements UserState {
    private final User user;

    public SleepState(User user) {
        this.user = user;
    }

    @Override
    public void wake() {
        System.out.println("Waking up this clients...");
        System.out.println("Client is in wake state.");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep this client...");
        System.out.println("Client is already in sleep state.");
    }
}
