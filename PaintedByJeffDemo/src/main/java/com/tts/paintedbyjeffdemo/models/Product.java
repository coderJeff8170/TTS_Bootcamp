package com.tts.paintedbyjeffdemo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;
    
    //remove quantity, as paintings are 1 of a kind.
    
    private int price;
    
    private String name;
    private String dimensions;
    private String media;
    private String description;
    private String category;
    private String image;
    
    private Boolean sold;
    
    public Product () {
    	
    }

	public Product(Long id, int price, String name, String dimensions, String media, String description,
			String category, String image, Boolean sold) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.dimensions = dimensions;
		this.media = media;
		this.description = description;
		this.category = category;
		this.image = image;
		this.sold = sold;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	

	public Boolean getIsSold() {
		return sold;
	}

	public void setIsSold(Boolean isSold) {
		this.sold = isSold;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", dimensions=" + dimensions + ", media="
				+ media + ", description=" + description + ", category=" + category + ", image=" + image + ", sold="
				+ sold + "]";
	}

	

	


}

