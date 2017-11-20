package com.wttechnologies.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/wttechnologies/example/beans/beans.xml");

		OffersDAO offersDao = (OffersDAO) context.getBean("offersDAO");
		try {
			Offer offer4 = new Offer("Frank", "Frank@noWhere", "Doing some Commander in Chiefing");
			Offer offer1 = new Offer("Jeremi", "Jeremi@noWhere", "Doing some Boxing");
			Offer offer2 = new Offer("Harold", "Harold@noWhere", "Doing some Plumbing");
			Offer offer3 = new Offer("Arnold", "Arnold@noWhere", "Doing some Real estate brokering");

			List<Offer> offerList = new ArrayList<Offer>();

			offerList.add(offer1);
			offerList.add(offer2);
			offerList.add(offer3);
			offerList.add(offer4);
			
			int[] rvals = offersDao.create(offerList);
			
			for(int value: rvals)
				System.out.println("Updated" + value);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		} finally {
			List<Offer> offers = offersDao.getOffers();
			for (Offer offer : offers)
				System.out.println(offer);
		}

		((ClassPathXmlApplicationContext) context).close();
	}

}
