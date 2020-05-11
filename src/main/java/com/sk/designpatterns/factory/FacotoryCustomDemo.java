package com.sk.designpatterns.factory;

public class FacotoryCustomDemo {

	public static void main(String[] args) {
		Website blogWebsite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(blogWebsite.getPages());
		
		Website shopWebsite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println(shopWebsite.getPages());

	}

}
