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
        System.out.println("User is not awake.");
        user.setState(user.getSleepState());
    }

    @Override
    public void sleep() {
        System.out.println("User is sleeping.");
        user.setState(user.getSleepState());
    }

    @Override
    public String toString() {
        return "Sleep State";
    }
}
