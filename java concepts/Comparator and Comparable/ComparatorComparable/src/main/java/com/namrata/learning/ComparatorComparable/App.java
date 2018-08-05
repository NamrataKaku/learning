package com.namrata.learning.ComparatorComparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.namrata.learning.ComparatorComparable.Comparator.SkuNameCompare;
import com.namrata.learning.ComparatorComparable.pojo.Sku;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<Sku> skus = new ArrayList<Sku>();
        
        Sku sku1 = new Sku(1l, 70l, "skuakjsdbb");
        
        Sku sku2 = new Sku(2l, 20l, "skauaksudc");
        
        Sku sku3 = new Sku(2l, 20l, "skauajksudc");
        
        skus.add(sku1);
        skus.add(sku2);
        skus.add(sku3);
        
        Collections.sort(skus);
        
        SkuNameCompare nameCompare = new SkuNameCompare();
        
        Collections.sort(skus, nameCompare);
        
        System.out.println(skus);
    }
}
