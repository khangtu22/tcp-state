package backend.concretestate;

import backend.context.User;
import backend.state.UserState;

public class AuthenticateState implements UserState {
    private User user;

    public AuthenticateState() {
    }

    public AuthenticateState(User user) {
        this.user = user;
    }

    @Override
    public void wake() {
        user.setState(user.getAuthenticateState());
        System.out.println("User is awake.");
    }

    @Override
    public void sleep() {
        user.setState(user.getAuthenticateState());
        System.out.println("Not sleeping.");
    }

    @Override
    public String toString() {
        return "Authenticate state.";
    }
}
