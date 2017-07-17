package com.mobitel.MobitelBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.SupplierDAO;
import com.mobitel.MobitelBackend.model.Supplier;

public class SupplierTestCase {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.mobitel.MobitelBackend");

		context.refresh();

		// Inserting a Category Object.
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");

		// Insertion TestCase

		Supplier supplier = new Supplier();
		
		supplier.setSuppname("Priyanka");
		supplier.setSuppaddr("Bhayandra");

		supplierDAO.insertUpdateSupplier(supplier);
		System.out.println("Supplier Details Inserted");

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

		// List<Product> list=productDAO.getProductDetails();
		//
		// for(Product product:list)
		// {
		// System.out.println(product.getProdid()+":"+product.getProdname()+":"+product.getProddesc());
		// }

		// Update the Product
		// Product product=productDAO.getProduct(3);
		// product.setCatname("WifiEnMobile");
		// productDAO.insertUpdateProduct(product);
		// System.out.println("The Product Updated");

	}
}