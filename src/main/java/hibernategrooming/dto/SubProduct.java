package hibernategrooming.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subProduductId;
	private String subProductBrand;
	private double subProductPrice;
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;
	
	
	public int getSubProduductId() {
		return subProduductId;
	}
	public void setSubProduductId(int subProduductId) {
		this.subProduductId = subProduductId;
	}
	public String getSubProductBrand() {
		return subProductBrand;
	}
	public void setSubProductBrand(String subProductBrand) {
		this.subProductBrand = subProductBrand;
	}
	public double getSubProductPrice() {
		return subProductPrice;
	}
	public void setSubProductPrice(double subProductPrice) {
		this.subProductPrice = subProductPrice;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "SubProduct [subProduductId=" + subProduductId + ", subProductBrand=" + subProductBrand
				+ ", subProductPrice=" + subProductPrice + "]";
	}

	
	
	
	
}
