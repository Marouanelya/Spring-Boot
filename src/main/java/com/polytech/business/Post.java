package com.polytech.business;


import javax.persistence.*;

/**
 * Created by dev on 3/13/17.
 */
@Entity
@Table(name = "POSTS")
public class Post {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "USERNAME")
    private String username;

    public Post(){}

    public Post(String username, String content) {
        this.setUsername(username);
        this.setContent(content);
    }

    @Override
    public String toString() {
        return getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
