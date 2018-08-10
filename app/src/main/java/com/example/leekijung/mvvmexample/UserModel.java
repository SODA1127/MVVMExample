package com.example.leekijung.mvvmexample;

/**
 *
 */
public class UserModel {
    private String id;
    private String pw;
    private String hint;
    private String pwHint;

    public UserModel() {
    }

    public UserModel(String hint, String pwHint) {
        this.hint = hint;
        this.pwHint = pwHint;
    }
}
