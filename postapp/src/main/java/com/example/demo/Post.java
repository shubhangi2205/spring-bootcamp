package com.example.demo;

public class Post {
	
	
	int id;
	int userId;
	String title;
	String body;
	public Post() {
		
	}
	
	public Post(int id,int userId,String title,String body) {
		super();
		this.id=id;
		this.userId=userId;
		this.title=title;
		this.body=body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getBody() {
		// TODO Auto-generated method stub
		return body;
	}

	

	

}
