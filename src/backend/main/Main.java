package backend.main;

import backend.concretestate.AuthenticateState;
import backend.concretestate.IdleState;
import backend.context.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Khang", "ASKJSAJd");
        System.out.println(user);
        user.setState(new AuthenticateState(user));
        System.out.println(user);
        user.setState(new IdleState(user));
        System.out.println(user);

    }
}
