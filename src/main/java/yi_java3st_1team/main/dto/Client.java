package yi_java3st_1team.main.dto;

import java.util.Date;

public class Client {
	private int cNo;
	private String cName;
	private String cCeo;
	private String cAddress;
	private String cTel;
	private String cId;
	private String cPass;
	private String cMail;
	private Date cRegiDate;
	private Employee salesman;

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(int cNo) {
		this.cNo = cNo;
	}

	public Client(int cNo, String cName) {
		this.cNo = cNo;
		this.cName = cName;
	}

	public Client(int cNo, String cName, String cCeo, String cAddress, String cTel, String cId, String cPass,
			String cMail, Date cRegiDate, Employee salesman) {
		this.cNo = cNo;
		this.cName = cName;
		this.cCeo = cCeo;
		this.cAddress = cAddress;
		this.cTel = cTel;
		this.cId = cId;
		this.cPass = cPass;
		this.cMail = cMail;
		this.cRegiDate = cRegiDate;
		this.salesman = salesman;
	}

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcCeo() {
		return cCeo;
	}

	public void setcCeo(String cCeo) {
		this.cCeo = cCeo;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcTel() {
		return cTel;
	}

	public void setcTel(String cTel) {
		this.cTel = cTel;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcPass() {
		return cPass;
	}

	public void setcPass(String cPass) {
		this.cPass = cPass;
	}

	public String getcMail() {
		return cMail;
	}

	public void setcMail(String cMail) {
		this.cMail = cMail;
	}

	public Date getcRegiDate() {
		return cRegiDate;
	}

	public void setcRegiDate(Date cRegiDate) {
		this.cRegiDate = cRegiDate;
	}

	public Employee getSalesman() {
		return salesman;
	}

	public void setSalesman(Employee salesman) {
		this.salesman = salesman;
	}

	@Override
	public String toString() {
		return "Client [cNo=" + cNo + ", cName=" + cName + ", cCeo=" + cCeo + ", cAddress=" + cAddress + ", cTel="
				+ cTel + ", cId=" + cId + ", cPass=" + cPass + ", cMail=" + cMail + ", cRegiDate=" + cRegiDate
				+ ", salesman=" + salesman + "]";
	}

}
