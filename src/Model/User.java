package Model;

public class User {
	private String name,address,location,company_name,remark;
	private int id,loan_amount,disbursement_amount,emi;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	public int getDisbursement_amount() {
		return disbursement_amount;
	}
	public void setDisbursement_amount(int disbursement_amount) {
		this.disbursement_amount = disbursement_amount;
	}
	
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	public User(String name, String address, String location, String company_name, String remark,
			int id,int loan_amount, int disbursement_amount,int emi) {
		super();
		this.name = name;
		this.address = address;
		this.location = location;
		this.company_name = company_name;
		
		this.remark = remark;
		this.id = id;
		
		this.loan_amount = loan_amount;
		this.disbursement_amount = disbursement_amount;
		this.emi = emi;
	}
	public User(String name, String address, String location, String company_name, String bank_name, String remark,
			 int loan_amount, int disbursement_amount, int emi) {
		super();
		this.name = name;
		this.address = address;
		this.location = location;
		this.company_name = company_name;
		this.remark = remark;
		this.loan_amount = loan_amount;
		this.disbursement_amount = disbursement_amount;
		this.emi = emi;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
