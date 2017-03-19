package com.polytech.business;

import javax.persistence.*;

/**
 * Created by E.Marouane on 19/03/2017.
 */
@Entity
@Table(name = "LIKES")
public class Like {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    public Like(){}

    public Like(String username){
        this.setUsername(username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
