package com.factory.pattern;

public class StandardPlan extends NetflixPlan{

	@Override
	public int getPrice() {
		price = 649;
		return price;
	}

}
