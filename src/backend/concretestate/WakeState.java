package backend.concretestate;

import backend.state.UserState;

public class WakeState implements UserState {
    @Override
    public void wake() {
        System.out.println("Waking up this client...");
        System.out.println("Client is already in wake state.");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep this client...");
        System.out.println("Client is in sleep state.");
    }
}
