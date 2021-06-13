package com.advantageonlineshopping.automations.models;

public class Data {

    private String userName;
    private String password;
    private String safePayUserName;
    private String safePayPassword;

    public Data(String userName, String password, String safePayUserName, String safePayPassword) {
        this.userName = userName;
        this.password = password;
        this.safePayUserName = safePayUserName;
        this.safePayPassword = safePayPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getSafePayUserName() {
        return safePayUserName;
    }

    public String getSafePayPassword() {
        return safePayPassword;
    }
}
