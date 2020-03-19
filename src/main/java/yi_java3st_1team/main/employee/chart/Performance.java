package yi_java3st_1team.main.employee.chart;

public class Performance {
	private String saleNo;
	private String saleName;
	private int sales1;
	private int sales2;
	private int sales3;
	private int sales4;
	public Performance() {
		// TODO Auto-generated constructor stub
	}

	public Performance(String saleNo, String saleName, int sales1) {
		this.saleNo = saleNo;
		this.saleName = saleName;
		this.sales1 = sales1;
	}

	public Performance(String saleNo, String saleName, int sales1, int sales2, int sales3, int sales4) {
		this.saleNo = saleNo;
		this.saleName = saleName;
		this.sales1 = sales1;
		this.sales2 = sales2;
		this.sales3 = sales3;
		this.sales4 = sales4;
	}

	public String getSaleNo() {
		return saleNo;
	}
	public void setSaleNo(String saleNo) {
		this.saleNo = saleNo;
	}
	public String getSaleName() {
		return saleName;
	}
	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public int getSales1() {
		return sales1;
	}

	public void setSales1(int sales1) {
		this.sales1 = sales1;
	}

	public int getSales2() {
		return sales2;
	}

	public void setSales2(int sales2) {
		this.sales2 = sales2;
	}

	public int getSales3() {
		return sales3;
	}

	public void setSales3(int sales3) {
		this.sales3 = sales3;
	}

	public int getSales4() {
		return sales4;
	}

	public void setSales4(int sales4) {
		this.sales4 = sales4;
	}

	
}
