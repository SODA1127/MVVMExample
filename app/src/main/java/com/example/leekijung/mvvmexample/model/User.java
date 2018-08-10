package com.example.leekijung.mvvmexample.model;

/**
 *
 */
public class User {
    private String id;
    private String pw;
    private String hint;
    private String pwHint;

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public User(String id, String pw, String hint, String pwHint) {
        this.id = id;
        this.pw = pw;
        this.hint = hint;
        this.pwHint = pwHint;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getHint() {
        return hint;
    }

    public String getPwHint() {
        return pwHint;
    }
}
