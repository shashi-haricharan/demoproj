package beautySalon;

import java.util.ArrayList;

public class BeautyParlor {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers=new ArrayList<Customer>();
		ArrayList<Visit> visits=new ArrayList<Visit>();
		Customer customer1=new Customer("Rose");
		customer1.setMember(true);
		customer1.setMemberType("PREMIUM");
		Visit visit1=new Visit(customer1.getName());
		visit1.setServiceExpense(1000.30);
		visit1.setProductExpense(2000.50);
		Customer customer2=new Customer("Emily");
		customer2.setMember(false);
		customer2.setMemberType("GOLD");
		Visit visit2=new Visit(customer2.getName());
		visit2.setServiceExpense(3000);
		visit2.setProductExpense(2000);
		customers.add(customer1);
		customers.add(customer2);
		visits.add(visit1);
		visits.add(visit2);
		for(Customer cust:customers){
			System.out.println(cust.toString());
		for(Visit visit:visits){
			double totalBill=0;
			if(cust.isMember()==true){
			double service=0;double product=0;
			double serviceExpense=visit.getServiceExpense()*DiscountRate.getServiceDiscountRate(cust.getMemberType());
			double productExpense=visit.getProductExpense()*DiscountRate.getProductDiscountRate(cust.getMemberType());
			service=visit.getServiceExpense()-serviceExpense;
			product=visit.getProductExpense()-productExpense;
			totalBill=service+product;
			System.out.println("Total Bill of customer"+cust.getName()+ "is :"+totalBill);
			}
			else{
			
			double service=0;double product=0;
			double serviceExpense=visit.getServiceExpense()*0.1;
			double productExpense=visit.getProductExpense()*0.1;
			service=visit.getServiceExpense()-serviceExpense;
			product=visit.getProductExpense()-productExpense;
			totalBill=service+product;
			System.out.println("Total Bill of customer"+cust.getName()+ "is :"+totalBill);
		}
	}
	}
	}
}
