package model;

import java.io.Serializable;

public class Product implements Serializable
{
	String productId;
	String productName;
	String productDescription;
	float price;
	int stock;
	public Product(){}
	
	public Product(String productId, String productName,
			String productDescription, float price, int stock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.stock = stock;
	}

	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productDescription=" + productDescription
				+ ", price=" + price + ", stock=" + stock + "]";
	}
	
}
