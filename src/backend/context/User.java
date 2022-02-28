package backend.context;

import backend.concretestate.WakeState;
import backend.state.UserState;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;


public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -6500665823330706018L;
    private UserState userState;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.userState = new WakeState();
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    public void wake(){
        this.userState.wake();
    }

    public void sleep(){
        this.userState.sleep();
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    public void inputUser() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter username: ");
        this.username = myObj.nextLine();
        System.out.print("Enter password: ");
        this.password = myObj.nextLine();
    }
}


