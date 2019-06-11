package com.example.mvc.vo;

public class Username {


    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public Username(String username) {
        this.username = username;
    }

    public Username() {
    }

    @Override
    public String toString() {
        return "Username{" +
                "username='" + username + '\'' +
                '}';
    }
}
