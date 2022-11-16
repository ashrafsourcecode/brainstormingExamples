package com.groupingby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javafx.util.*;

public class ExGrouping {

	public static void main(String[] args) {
		
		BlogPost blogPost = new  BlogPost();
		BlogPost blogPost2 = new  BlogPost();
		BlogPost blogPost3 = new  BlogPost();
		
		blogPost.setAuthor("Ashraf");
		blogPost.setLikes(100);
		blogPost.setTitle("Bismillah");
		blogPost.setType(BlogPostType.NEWS);
		blogPost2.setAuthor("Ashraf2");
		blogPost2.setLikes(3);
		blogPost2.setTitle("Bismillah");
		blogPost2.setType(BlogPostType.GUIDE);
		blogPost3.setAuthor("Ashraf3");
		blogPost3.setLikes(3);
		blogPost3.setTitle("Bismillah");
		blogPost3.setType(BlogPostType.REVIEW);
		
		List<BlogPost> posts = new ArrayList<>();
		posts.add(blogPost);
		posts.add(blogPost2);
		posts.add(blogPost3);
		
		Map<String, List<BlogPost>> postsPerType = 
				posts.stream()
				  .collect(Collectors.groupingBy(BlogPost::getTitle));		
		System.out.println(postsPerType);
		
		//Map<String, Map<BlogPostType, List<BlogPost>>> map = posts.stream()
		//		  .collect(Collectors.groupingBy
		//				  (BlogPost::getType, Collectors.groupingBy(BlogPost::getAuthor)));		
		/*
		 * Map<String, Map<BlogPostType, List<BlogPost>>> map = posts.stream()
		 * .collect(Collectors.groupingBy (BlogPost::getType,
		 * Collectors.groupingBy(BlogPost::getAuthor)));
		 */
		
		
		Map<BlogPostType,  Map<Integer, List<BlogPost>>> averageLikesPerType = posts.stream()
				  .collect(Collectors.groupingBy(BlogPost::getType, Collectors.groupingBy(BlogPost::getLikes)));
		System.out.println("--->"+averageLikesPerType);

	}

}
