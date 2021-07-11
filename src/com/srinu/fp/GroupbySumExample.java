package com.srinu.fp;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product
{
	private Integer productId;
	private String productdesc;
	private String productCategory;
	private String productgroup;
	private Integer quantity;
	public Integer getProductId() {
		return productId;
	}
	public Product(Integer productId, String productdesc, String productCategory, String productgroup,
			Integer quantity) {
		super();
		this.productId = productId;
		this.productdesc = productdesc;
		this.productCategory = productCategory;
		this.productgroup = productgroup;
		this.quantity = quantity;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductgroup() {
		return productgroup;
	}
	public void setProductgroup(String productgroup) {
		this.productgroup = productgroup;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productdesc=" + productdesc + ", productCategory="
				+ productCategory + ", productgroup=" + productgroup + ", quantity=" + quantity + "]";
	}
	
}

public class GroupbySumExample {
	public static void main(String[] args) {
		
		List<Product> products=List.of(
				new Product(1,"soap", "Non-eatbles", "A", 3),
				new Product(2,"detergent", "Non-eatbles", "A", 2),
				new Product(3,"washliquid", "Non-eatbles", "A", 5),
				new Product(4,"sanitizer", "Non-eatbles", "A", 8),
				new Product(5,"oil", "eatbles", "B", 2),
				new Product(6,"chacolate", "eatbles", "B", 9),
				new Product(7,"rice", "eatbles", "B", 3),
				new Product(8,"pen", "Non-eatbles", "A", 5),
				new Product(9,"item9", "util", "C", 8),
				new Product(10,"item10", "util", "C", 13));
		
		/*
		 * System.out.println( products.stream()
		 * .collect(Collectors.groupingBy(Product::getProductgroup,
		 * Collectors.counting())));
		 */
		Map<String, Integer> resultmap= products.stream()
				.collect(Collectors.groupingBy(Product::getProductgroup,Collectors.summingInt(Product::getQuantity)));
		System.out.println(resultmap);
				
	}

}
