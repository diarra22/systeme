package com.diarra.systeme.bean;
import javax.persistence.*;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    public User() {
        super();
    }

    public User(String name, @Email String email, String username, String password) {
        super();
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public User(long id, String name, @Email String email, String username, String password) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @Email
    private String email;

    @Column(unique = true)
    private String username;

    @JsonIgnore
    private String password;



    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Formation> formations = new HashSet<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*@Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", username=" + username + "]";
    }
   */
}

