package myapp.model;

public class Contact {
	String employee_id,employee_Name,home_Num,mobile_Num,office_Num,email;
public Contact(){
	
}
	public Contact(String employee_id, String employee_Name, String home_Num, String mobile_Num, String office_Num,
			String email) {
		super();
		this.employee_id = employee_id;
		this.employee_Name = employee_Name;
		this.home_Num = home_Num;
		this.mobile_Num = mobile_Num;
		this.office_Num = office_Num;
		this.email = email;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_Name() {
		return employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}

	public String getHome_Num() {
		return home_Num;
	}

	public void setHome_Num(String home_Num) {
		this.home_Num = home_Num;
	}

	public String getMobile_Num() {
		return mobile_Num;
	}

	public void setMobile_Num(String mobile_Num) {
		this.mobile_Num = mobile_Num;
	}

	public String getOffice_Num() {
		return office_Num;
	}

	public void setOffice_Num(String office_Num) {
		this.office_Num = office_Num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
