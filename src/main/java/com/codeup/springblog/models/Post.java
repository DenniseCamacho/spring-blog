package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "Posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false)
    private String body;

    @Column(nullable = false, length = 100)
    private String tags;

    public Post() {
    }

    public Post(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }



    public Post(String title, String body, String tags) {
        this.title = title;
        this.body = body;
        this.tags = tags;
    }

    //SET
    public void setId(long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }

//GET
    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }
    public String getTags() {
        return tags;
    }
}

