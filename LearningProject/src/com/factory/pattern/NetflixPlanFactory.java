package com.factory.pattern;

public class NetflixPlanFactory {

	public NetflixPlan getNetflixPlan(String plan) {
		if(plan == null){
			return null;
		}
		if (plan.equalsIgnoreCase("basic")){
			return new BasicPlan();
		}
		if (plan.equalsIgnoreCase("Standard")){
			return new StandardPlan();
		}
		if (plan.equalsIgnoreCase("Premiuim")){
			return new PremiumPlan();
		}
		return null;
		}
}
