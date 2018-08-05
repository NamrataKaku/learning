package com.namrata.learning.ComparatorComparable.Comparator;

import java.util.Comparator;

import com.namrata.learning.ComparatorComparable.pojo.Sku;

public class SkuNameCompare implements Comparator<Sku> {

	public int compare(Sku o1, Sku o2) {
		
		return o1.getSkuName().compareTo(o2.getSkuName());
	}

	
}
