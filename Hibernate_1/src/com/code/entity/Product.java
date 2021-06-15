package com.code.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


//mapping the table 
@Entity
@Table (name="product")
public class Product {
	//create the member variable
	//mapped the member variable with table column
	//create a relationship
	//constructor
	//getter and the setter
	//tostring()
	@Id
	//the value will generated automatically
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int productid;
	@Column(name="productname")
	String pname;
	@Column(name="price")
	double price;
	//created the relationship with the table called Category
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinTable(
			name="category",
		   joinColumns= @JoinColumn(name="catid")
			)
	Category cat;
	
	
}
