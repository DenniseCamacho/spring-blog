package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.PostImage;
import com.codeup.springblog.models.Tag;
import com.codeup.springblog.respositories.PostRepository;
import com.codeup.springblog.respositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;

    public PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }

//    public String generatePosts(Model model){
//        List<Post> posts = postDao.findAll();
//        model.addAttribute("posts", posts);
//        return "posts/index";
//    }
//    public List<Post> generatePosts(){
//        List<Post> allPosts = new ArrayList<>();
//        Post post1 = new Post(1, "First post", "This is my first post!");
//        Post post2 = new Post(2, "Another post!", "Amazing content!");
//        Post post3 = new Post(3, "Third post", "Fascinating information!");
//        allPosts.add(post1);
//        allPosts.add(post2);
//        allPosts.add(post3);
//        return allPosts;
//    }

    @GetMapping
    public String allPosts(Model model){
        List<Post> allPosts = postDao.findAll();
        model.addAttribute("allPosts", allPosts);
        return "posts/index";
    }

//    @GetMapping("/{id}")
//    public String onePost(@PathVariable long id, Model model){
//        List<Post> allPosts = generatePosts();
//        Post post = null;
//        for (int i = 0; i < allPosts.size(); i++){
//            if (allPosts.get(i).getId() == id){
//                post = allPosts.get(i);
//            }
//        }
//        model.addAttribute("post", post);
//        return "posts/show";
//    }

    @GetMapping("/create")
    public String createPost(){
        return "/posts/create";
    }

    @PostMapping("/create")
    public String submitPost(
            @RequestParam(name = "title") String title, @RequestParam(name = "body") String body, @RequestParam(name = "tags") Tag tags
    )
    {
        Post post = new Post(title, body, tags);
        postDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/{id}")
    public String onePost(@PathVariable long id, Model model){
        Post post = postDao.findById(id);
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/{id}/images")
    public String addImageForm(@PathVariable long id, Model model) {
        Post post = postDao.findById(id);
        model.addAttribute("post", post);
        return "posts/add-image";
    }

    @PostMapping("/{id}/images")
    public String addImage(@PathVariable long id, @RequestParam String title, @RequestParam String url) {
        Post post = postDao.getById(id);
        post.getImages().add(new PostImage(title, url, post));
        postDao.save(post);
        return "redirect:/posts";
    }




}
