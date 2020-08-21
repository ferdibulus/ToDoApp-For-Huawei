package com.todoapp_project.todoapp.dto;

public class ListDto {
	private String listName;
	
	public ListDto() {
		
	}

	public ListDto(String listName) {
		super();
		this.listName = listName;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}
	
	
	

}
