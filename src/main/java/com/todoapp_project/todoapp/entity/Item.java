package com.todoapp_project.todoapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="item")
public class Item {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_desc")
	private String itemDesc;
	
	@Column(name="item_date")
	private String itemDate;
	
	@Column(name="item_dependency")
	private String itemDependency;
	
	@Column(name="item_status")
	private String itemStatus;
	
	public Item() {
		
	}

	public Item(String itemName, String itemDesc, String itemDate, String itemDependency, String itemStatus) {
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.itemDate = itemDate;
		this.itemDependency = itemDependency;
		this.itemStatus = itemStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemDate() {
		return itemDate;
	}

	public void setItemDate(String itemDate) {
		this.itemDate = itemDate;
	}

	public String getItemDependency() {
		return itemDependency;
	}

	public void setItemDependency(String itemDependency) {
		this.itemDependency = itemDependency;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	

}
