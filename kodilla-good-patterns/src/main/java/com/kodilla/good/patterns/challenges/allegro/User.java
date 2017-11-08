package com.kodilla.good.patterns.challenges.allegro;

public class User {

    private String userName ;
    private String realUserName;

    public User(String userName, String realUserName) {
        this.userName = userName;
        this.realUserName = realUserName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealUserName() {
        return realUserName;
    }
}
