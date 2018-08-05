package com.namrata.learning.ComparatorComparable.pojo;

public class Sku implements Comparable<Sku>{
	
	private Long id;
	
	private Long skuCode;
	
	private String skuName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(Long skuCode) {
		this.skuCode = skuCode;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public Sku(Long id, Long skuCode, String skuName) {
		super();
		this.id = id;
		this.skuCode = skuCode;
		this.skuName = skuName;
	}

	public int compareTo(Sku sku) {

		return (int) (this.skuCode - sku.getSkuCode());
	}

	@Override
	public String toString() {
		return "Sku [id=" + id + ", skuCode=" + skuCode + ", skuName=" + skuName + "]";
	}
	
	

}
