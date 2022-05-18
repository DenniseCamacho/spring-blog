package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "post_details")
public class PostDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    boolean isAwesome;
    @Column(nullable = false)
    private String historyOfPost;
    @Column(nullable = false, columnDefinition = "text")
    private String topicDescription;

    public boolean getIsAwesome() {
        return isAwesome;
    }
//    id (typical primary key annotations)
//    isAwesome boolean
//    historyOfPost TEXT
//    topicDescription VARCHAR(255)
//    @Override
//    public String toString(){
//
//    }
}
