package com.update.alumni.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Boolean superAdmin;
    private Boolean groupAdmin;
    private String profileImage;
//    private Binary image;
//    private List<Group> groups;
//    private List<Channel> channels;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
