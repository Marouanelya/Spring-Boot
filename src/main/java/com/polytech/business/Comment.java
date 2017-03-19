package com.polytech.business;


import javax.persistence.*;

/**
 * Created by E.Marouane on 19/03/2017.
 */
@Entity
@Table(name = "COMMENTS")
public class Comment {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "username")
    private String username;

    public Comment(){}

    public Comment(String username, String content){
        this.setContent(content);
        this.setUsername(username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
