package com.test.sample.config;

import javax.jws.WebService;

import sample.com.schema.sample.ProductRequestElement;
import sample.com.schema.sample.ProductResponseElement;
import sample.com.soap.webservice.Product;

@WebService(endpointInterface = "sample.com.soap.webservice.Product")
public class ProductImpl implements Product{

	@Override
	public ProductResponseElement getProduct(ProductRequestElement request) {
		System.out.println("In the operation - getProduct");
		return new ProductResponseElement();
	}

}
