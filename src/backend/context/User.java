package backend.context;

import backend.concretestate.AuthenticateState;
import backend.concretestate.IdleState;
import backend.concretestate.SleepState;
import backend.state.UserState;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;


public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -6500665823330706018L;
    private UserState sleepState;
    private UserState authenticateState;
    private UserState idleState;
    private UserState userState;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.idleState = new IdleState(this);
        this.authenticateState = new AuthenticateState(this);
        this.sleepState = new SleepState(this);
        userState = idleState;
    }

    public UserState getSleepState() {
        return sleepState;
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
    public void setState(UserState state) { userState = state; }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    public void wake(){
        this.userState.wake();
    }

    public void sleep(){
        this.userState.sleep();
    }

    public UserState getAuthenticateState() {
        return authenticateState;
    }

    public UserState getIdleState() {
        return idleState;
    }

    //User Actions:
    public void startProgram(){
        userState.sleep();
    }

    public void loginToSystem(){
        userState.wake();
    }

    public void putToSleep(){
        userState.sleep();
    }

    public void wakeClientUp(){
        userState.sleep();
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Welcome to chat app.\n");
        result.append("User:\t").append(username);
        result.append("User State:\t").append(userState).append("\n");
        return result.toString();
    }

    public void inputUser() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter username: ");
        this.username = myObj.nextLine();
        System.out.print("Enter password: ");
        this.password = myObj.nextLine();
    }
}


