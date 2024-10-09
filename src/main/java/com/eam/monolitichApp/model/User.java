package com.eam.monolitichApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identification", length = 11, unique = true)
    private String identification;

    @Column(name = "name", length = 40)
    private String name;

    @Column(name = "last_name", length = 40)
    private String lastName;

    @Column(name = "address", length = 60)
    private String address;

    @Column(name = "email", length = 60, unique = true)
    private String email;

    @Column(name = "userName", length = 40)
    private String userName;

    @Column(name ="password", length = 30)
    private String password;

    public User() {
        super();
    }

    public User(Long id, String identification, String name, String lastName, String address, String email, String userName, String password) {
        this.id = id;
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public User(String identification, String name, String lastName, String address, String email, String userName, String password) {
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
