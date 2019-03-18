package com.company;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<User> users = new ArrayList<User>();

    public Group(String name) {
        this.name = name;
    }

    public Group() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }
public void addUser(User user){
        users.add(user);
}
    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
