package beautySalon;

public class Customer {

	private String name;
	private boolean member=false;
	private String memberType;
	
	public Customer(String name){
		this.name=name;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getMemberType() {
		return memberType;
	}
	
	public String getName() {
		return name;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member
				+ ", memberType=" + memberType + "]";
	}
}
