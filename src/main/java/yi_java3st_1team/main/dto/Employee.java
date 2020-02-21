package yi_java3st_1team.main.dto;

public class Employee {
	private int empNo;
	private String empName;
	private int dNo;
	private String empTitle;
	private int empManager;
	private String empId;
	private String empPass;
	private String empMail;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo) {
		this.empNo = empNo;
	}

	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}

	public Employee(int empNo, String empName, int dNo, String empTitle, int empManager, String empId, String empPass,
			String empMail) {
		this.empNo = empNo;
		this.empName = empName;
		this.dNo = dNo;
		this.empTitle = empTitle;
		this.empManager = empManager;
		this.empId = empId;
		this.empPass = empPass;
		this.empMail = empMail;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getdNo() {
		return dNo;
	}

	public void setdNo(int dNo) {
		this.dNo = dNo;
	}

	public String getEmpTitle() {
		return empTitle;
	}

	public void setEmpTitle(String empTitle) {
		this.empTitle = empTitle;
	}

	public int getEmpManager() {
		return empManager;
	}

	public void setEmpManager(int empManager) {
		this.empManager = empManager;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpPass() {
		return empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", dNo=" + dNo + ", empTitle=" + empTitle
				+ ", empManager=" + empManager + ", empId=" + empId + ", empPass=" + empPass + ", empMail=" + empMail
				+ "]";
	}

}
