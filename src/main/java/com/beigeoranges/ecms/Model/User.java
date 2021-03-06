package com.beigeoranges.ecms.Model;


public class User {

    private Long userId;
    private String email;
    private String encryptedPassword;
    private String firstName;
    private String lastName;

    public User() {

    }

    public User(Long userId, String email, String encryptedPassword, String firstName, String lastName) {
        this.userId = userId;
        this.email = email;
        this.encryptedPassword = encryptedPassword;
        this.firstName = firstName;

        this.lastName = lastName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    @Override
    public String toString() {
        return this.email + "/" + this.encryptedPassword;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String compString(){
        return lastName + firstName + email;
    }


}
