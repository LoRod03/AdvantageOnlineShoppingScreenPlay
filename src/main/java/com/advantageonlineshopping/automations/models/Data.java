package com.advantageonlineshopping.automations.models;

public class Data {

    private String userName;
    private String password;
    private String safePayUserName;
    private String safePayPassword;
    private String validateText;

    public Data(String userName, String password, String safePayUserName, String safePayPassword, String validateText) {
        this.userName = userName;
        this.password = password;
        this.safePayUserName = safePayUserName;
        this.safePayPassword = safePayPassword;
        this.validateText = validateText;
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

    public String getValidateText() {
        return validateText;
    }
}
