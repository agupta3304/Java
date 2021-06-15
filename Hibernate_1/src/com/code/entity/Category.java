package com.code.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

//Mapped  this class with my table called category
@Entity
@Table (name="category")
public class Category {
	//create the member variable and mapped with the column name of the table
	@Id
	@Column (name="catid")
	int catid ;
	@Column (name="name")
	String name;
	//default constructor
	public Category() {
		this.catid = 0;
		this.name = null;
	}
	//create the getter and the setter and the constructor
	/**
	 * @param catid
	 * @param name
	 */
	public Category(int catid, String name) {
		this.catid = catid;
		this.name = name;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [catid=" + catid + ", name=" + name + "]";
	}
	
}
