package hibernategrooming.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productCategory;
	private String productDescription;
	@OneToMany(cascade = CascadeType.ALL)
	private List<SubProduct> subProducts;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public List<SubProduct> getSubProducts() {
		return subProducts;
	}
	public void setSubProducts(List<SubProduct> subProducts) {
		this.subProducts = subProducts;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCategory=" + productCategory + ", productDescription="
				+ productDescription + ", subProducts=" + subProducts + "]";
	}
	
	
	
}
