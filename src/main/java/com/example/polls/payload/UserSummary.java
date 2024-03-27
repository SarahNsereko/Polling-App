package com.example.polls.payload;

import com.example.polls.model.RoleName;

import java.util.ArrayList;

public class UserSummary {
    private Long id;
    private String username;
    private String name;
    private ArrayList<RoleName> roles;

    public UserSummary(Long id, String username, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
    }

    public UserSummary(Long id, String username, String name, ArrayList<RoleName> roles) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return name;
    }

    public void setRole(String name) {
        this.name = name;
    }

    public ArrayList<RoleName> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<RoleName> roles) {
        this.roles = roles;
    }

}