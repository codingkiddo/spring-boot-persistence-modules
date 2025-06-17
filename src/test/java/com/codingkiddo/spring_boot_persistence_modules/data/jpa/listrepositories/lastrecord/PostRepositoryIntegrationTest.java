package com.codingkiddo.spring_boot_persistence_modules.data.jpa.listrepositories.lastrecord;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.listrepositories.lastrecord.Post;
import com.codingkiddo.spring_boot_persistence_modules.spring.data.jpa.listrepositories.lastrecord.PostRepository;

@DataJpaTest
public class PostRepositoryIntegrationTest {

	@Autowired
    private PostRepository postRepository;
	
	 @Test
	 public void givenPosts_whenUsingFindFirstDerivedQuery_thenReturnLastPost() {
		 Post post = postRepository.findLastPost();
		 List<Post> posts = postRepository.findAll();
		 System.out.println("postRepository: " + postRepository);
		 System.out.println("post: " + post);
		 System.out.println("posts: " + posts.size());
		 assertNotNull(posts);
		 assertEquals(5, post.getId());
	 }
}
