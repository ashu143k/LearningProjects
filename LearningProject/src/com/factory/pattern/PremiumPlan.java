package com.factory.pattern;

public class PremiumPlan extends NetflixPlan {

	@Override
	public int getPrice() {
		price = 799;
		return price;
	}

}
