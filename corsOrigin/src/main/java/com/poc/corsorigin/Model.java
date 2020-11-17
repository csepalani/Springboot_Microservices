package com.poc.corsorigin;

public class Model {

	private final long id;
	private final String content;
	
	public Model() {
		this.id = -1;
		this.content = "";
	}
	
	public Model(Long id , String content)
	{
		this.id = id;
		this.content = content;
	}
	
	public long getId()
	{
		return id;
	}
	
	public String getContent()
	{
		return content;
	}
}
