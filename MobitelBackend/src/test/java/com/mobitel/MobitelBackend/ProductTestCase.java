package com.mobitel.MobitelBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.mobitel.MobitelBackend.dao.ProductDAO;
import com.mobitel.MobitelBackend.model.*;

public class ProductTestCase {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.mobitel.MobitelBackend");

		context.refresh();

		// Inserting a Category Object.
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");

		// Insertion TestCase

		Product product = new Product();
		
		product.setProdname("True Color Lipstick Lava Love");
		product.setProdDesc("Bold,vivid color infused with vitamin E, Shea Butter and Omega 3.");
		product.setPrice(449);
		product.setQuantity(300); 
		product.setSuppid(1);
		product.setCatid(1);
		productDAO.insertUpdateProduct(product);
		System.out.println("Product Inserted");

		// Retrieval TestCase

		// Product product=productDAO.getProduct(2);
		// System.out.println("Product Name:"+product.getProdname());
		// System.out.println("Product Description:"+product.getProddesc());

		// Deletion TestCase
		/*
		 * Product product=productDAO.getProduct(2);
		 * productDAO.deleteProduct(product); System.out.println(
		 * "The Product Deleted");
		 */

		// Retrieving the Data

//		 List<Product> list=productDAO.getProductDetails();
//		
//		 for(Product product:list)
//		 {
//		 System.out.println(product.getProdid()+":::");
//		 System.out.println(product.getProdname());
//		 }
//		 System.out.println("Product Displayed");

		// Update the Product
		// Product product=productDAO.getProduct(3);
		// product.setCatname("WifiEnMobile");
		// productDAO.insertUpdateProduct(product);
		// System.out.println("The Product Updated");

	}

}
