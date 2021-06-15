package com.advantageonlineshopping.automations.models;

public class Data {

    private String userName;
    private String password;
    private String safePayUserName;
    private String safePayPassword;
    private String validateText;
    private String laptopReference;
    private String validateSearch;

    public Data(String userName, String password, String safePayUserName, String safePayPassword,
                String validateText, String laptopReference, String validateSearch) {
        this.userName = userName;
        this.password = password;
        this.safePayUserName = safePayUserName;
        this.safePayPassword = safePayPassword;
        this.validateText = validateText;
        this.laptopReference = laptopReference;
        this.validateSearch = validateSearch;
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

    public String getLaptopReference(){
        return laptopReference;
    }

    public String getValidateSearch(){
        return validateSearch;
    }
}
