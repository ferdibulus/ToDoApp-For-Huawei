package com.todoapp_project.todoapp.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="list")
public class List {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="list_name")
	private String listName;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "lists_items",
			joinColumns = @JoinColumn(
		            name = "list_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
				            name = "item_id", referencedColumnName = "id"))
	
	private Collection<Item> items;
	
	public List() {
		
	}
	
	
	public List(String listName) {
		this.listName = listName;
	}
	
	
	public List(String listName, Collection<Item> items) {
		super();
		this.listName = listName;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}
	
	
}
