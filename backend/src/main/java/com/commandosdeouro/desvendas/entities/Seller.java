package com.commandosdeouro.desvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_sellers")
public class Seller {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private	Long id;
private	String name;
private	String imageUri;

@OneToMany(mappedBy = "seller")
private List<Sale> sales = new ArrayList<>();

public Seller() {
	
}

public List<Sale> getSales() {
	return sales;
}





/**
 * @param id
 * @param name
 * @param imageUri
 * @param sales
 */
public Seller(Long id, String name, String imageUri, List<Sale> sales) {
	super();
	this.id = id;
	this.name = name;
	this.imageUri = imageUri;
	this.sales = sales;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public String getImageUri() {
	return imageUri;
}

public void setImageUri(String imageUri) {
	this.imageUri = imageUri;
}



}