package com.codeup.springblog;
import com.codeup.springblog.services.StringService;
import org.junit.Before;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class SimpleTests {
    private StringService stringService;
    @Before //"I want this to run before every test"
    public void setUp(){
        this.stringService = new StringService();
    }


}
