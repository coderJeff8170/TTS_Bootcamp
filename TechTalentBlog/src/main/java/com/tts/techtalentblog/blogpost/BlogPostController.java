package com.tts.techtalentblog.blogpost;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BlogPostController {
	
    @Autowired
    private BlogPostRepository blogPostRepository;
    private static List<BlogPost> posts = new ArrayList<>();
	
//    @GetMapping(value = "/")
//    public String index(BlogPost blogPost, Model model) {
//    	model.addAttribute("posts", posts);
//    	return "blogpost/index";
//    }
    
  //gets all blog posts from the db
    @GetMapping(value = "/")
    public String index(BlogPost blogPost, Model model) {
    	//remove previous posts from array list
        posts.removeAll(posts);
        //goes through db and adds a post object to the array list for each db entry
        for (BlogPost post : blogPostRepository.findAll()) {
        	posts.add(post);
        }
        //adds list object to page for thymeleaf iteration
        model.addAttribute("posts", posts);
        //return the page
        return "blogpost/index";
    }
    
    @GetMapping(value = "/blogposts/new")
    public String newBlog (BlogPost blogPost) {
        return "blogpost/new";
    }
    
    //to make edit function on result page, it needs an id for the post
    @PostMapping(value = "/blogposts")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
	blogPostRepository.save(new BlogPost(blogPost.getTitle(), blogPost.getAuthor(), blogPost.getBlogEntry()));
	posts.add(blogPost);
	model.addAttribute("title", blogPost.getTitle());
	model.addAttribute("author", blogPost.getAuthor());
	model.addAttribute("blogEntry", blogPost.getBlogEntry());
	model.addAttribute("blogEntry", blogPost.getId());//adds id to the page I think...
	return "blogpost/result";
    }
    
    //make a delete method...
    //@RequestMapping(value = "/blogposts/{id}", method = RequestMethod.DELETE)
//    @RequestMapping(value = "/blogposts/delete/{id}", method = RequestMethod.POST) <= forms only
//    public String deletePostWithId(@PathVariable Long id, BlogPost blogPost) {
//        blogPostRepository.deleteById(id);
//        return "redirect:/";
//
//    }
    
    @RequestMapping(value = "/blogposts/delete/{id}", method = RequestMethod.GET)
    public String deletePostWithId(@PathVariable Long id, BlogPost blogPost) {
        blogPostRepository.deleteById(id);
        return "redirect:/";

    }
    //edit entry method 
    //at this point you might have to make both buttons forms and set method to POST?
    @RequestMapping(value = "/blogposts/{id}", method = RequestMethod.GET)
    public String editPostWithId(@PathVariable Long id, BlogPost blogPost, Model model) {
        Optional<BlogPost> post = blogPostRepository.findById(id);
        if (post.isPresent()) {
            BlogPost actualPost = post.get();
            model.addAttribute("blogPost", actualPost);
        }
        return "blogpost/edit";
    }
    
    //changes all things in object and updates repo when submit edit post is smacked
    @RequestMapping(value = "/blogposts/update/{id}")
    public String updateExistingPost(@PathVariable Long id, BlogPost blogPost, Model model) {
        Optional<BlogPost> post = blogPostRepository.findById(id);
        if (post.isPresent()) {
            BlogPost actualPost = post.get();
            actualPost.setTitle(blogPost.getTitle());
            actualPost.setAuthor(blogPost.getAuthor());
            actualPost.setBlogEntry(blogPost.getBlogEntry());
            blogPostRepository.save(actualPost);
            model.addAttribute("blogPost", actualPost);
        }
 
        return "redirect:/";
    }

}
