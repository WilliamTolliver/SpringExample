package com.wttechnologies.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wttechnologies/example/beans/beans.xml");
		
		OffersDAO offersDao = (OffersDAO)context.getBean("offersDAO");
		
		List<Offer> offers = offersDao.getOffers();
		
		for(Offer offer : offers)
			System.out.println(offer.toString());
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
