package com.codeup.springblog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String body;

    @OneToOne
    @JoinColumn(name = "post_details")
    private PostDetails postDetails;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(
                name="tags",
                joinColumns={@JoinColumn(name="post_id")},
                inverseJoinColumns={@JoinColumn(name="tag_id")}
        )
        private List<Tag> tags;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<PostImage> images;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
//    @JsonManagedReference
//    private List<User> users;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
//    @JsonManagedReference
//    private Set<PostImage> post_images;





    public Post() {
    }

    public Post(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }



    public Post(String title, String body) {
        this.title = title;
        this.body = body;

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

    public void setImages(List<PostImage> images) {
        this.images = images;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setTags(List<Tag> tags) {
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
    public List<PostImage> getImages() {
        return images;
    }
    public User getUser() {
        return user;
    }
    public List<Tag> getTags() {
        return tags;
    }
}

