package backend.concretestate;

import backend.context.User;
import backend.state.UserState;

public class IdleState implements UserState {
    private final User user;

    public IdleState(User user) {
        this.user = user;
    }

    @Override
    public void wake() {
        user.setState(user.getIdleState());
        System.out.println("User is sleeping.");
    }

    @Override
    public void sleep() {
        user.setState(user.getIdleState());
        System.out.println("User is sleeping.");
    }

    @Override
    public String toString() {
        return "Idle State";
    }
}
