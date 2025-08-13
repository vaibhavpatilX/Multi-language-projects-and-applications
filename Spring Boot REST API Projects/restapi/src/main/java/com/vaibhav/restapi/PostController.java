package com.vaibhav.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/post")
    public Post getPost() {
        return new Post(
                1,
                1,
                "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\n" +
                        "reprehenderit molestiae ut ut quas totam\n" +
                        "nostrum rerum est autem sunt rem eveniet architecto"
        );
    }
}
