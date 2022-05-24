package com.codeup.springblog.respositories;
import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findById(long id);

    Post findFirstByTitle(String title);
}
