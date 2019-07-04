package com.mainacad.model;

import com.mainacad.service.UserGenerationService;

import java.util.Date;

public class User {

    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private final Gender gender;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public User(Gender gender) {
        this.gender = gender;
    }

    public User(String login, String password, String firstName, String lastName, Date dateOfBirth, Gender gender) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + dateOfBirth;
    }

//    @Override
//    public boolean equals(Object obj) {
//        User user = (User) obj;
//
//        return user.login.equals(this.login);
//    }
//
//    @Override
//    public int hashCode() {
//        return login.hashCode();
//    }
}
