package beautySalon;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {

	private Customer customer;
	private String name;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(String name){
		this.name=name;
		date=new Date(System.currentTimeMillis());
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	public String getName() {
		return name;
	}
	
	public double getTotalExpense(){
		return serviceExpense+productExpense;
	}

	@Override
	public String toString() {
		return "Visit [getServiceExpense()=" + getServiceExpense()
				+ ", getProductExpense()=" + getProductExpense()
				+ ", getName()=" + getName() + ", getTotalExpense()="
				+ getTotalExpense() + "]";
	}
	
	
}
