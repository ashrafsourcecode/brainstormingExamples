package com.groupingby;
class BlogPost {
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BlogPostType getType() {
		return type;
	}
	public void setType(BlogPostType type) {
		this.type = type;
	}
	public int getLikes() {
		return likes;
	}
	@Override
	public String toString() {
		return "BlogPost [title=" + title + ", author=" + author + ", type=" + type + ", likes=" + likes + "]";
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	String title;
    String author;
    BlogPostType type;
    int likes;
}