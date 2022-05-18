package com.codeup.springblog.models;
import javax.persistence.*;

@Entity
@Table(name="post_images")
public class PostImage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 100)
    private String image_title;
    @Column(nullable = false, length = 1000)
    private String url;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
