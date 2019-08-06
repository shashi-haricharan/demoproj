package beautySalon;

public class DiscountRate {

	private static double serviceDiscountPremium=0.2;
	private static double serviceDiscountGold=0.15;
	private static double serviceDiscountSilver=0.1;
	private static double productDiscountPremium=0.1;
	private static double productDiscountGold=0.1;
	private static double productDiscountSilver=0.1;
	
	public static double getServiceDiscountRate(String type){
		double serviceDiscount=0;
		if(type.equals("PREMIUM"))
			serviceDiscount= serviceDiscountPremium;
		else if(type.equals("GOLD"))
			serviceDiscount= serviceDiscountGold;
		else if(type.equals("SILVER"))
			serviceDiscount= serviceDiscountSilver;
		return serviceDiscount;
	}
	
	public static  double getProductDiscountRate(String type){
		double productDiscount=0;
		if(type.equals("PREMIUM"))
			productDiscount= productDiscountPremium;
		else if(type.equals("GOLD"))
			productDiscount= productDiscountGold;
		else if(type.equals("SILVER"))
			productDiscount= productDiscountSilver;
		return productDiscount;
	}
	
}
