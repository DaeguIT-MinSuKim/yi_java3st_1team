package yi_java3st_1team.viewsmanagement.dto;

public class SWSale {
	private String p_name;
	private String cate_name;
	private String s_name;
	private int supplyAmount;
	private int salesAmount;
	private int discount;
	private int salesProfit;

	public SWSale() {
		// TODO Auto-generated constructor stub
	}

	public SWSale(String p_name, String cate_name, String s_name, int supplyAmount, int salesAmount, int discount,
			int salesProfit) {
		super();
		this.p_name = p_name;
		this.cate_name = cate_name;
		this.s_name = s_name;
		this.supplyAmount = supplyAmount;
		this.salesAmount = salesAmount;
		this.discount = discount;
		this.salesProfit = salesProfit;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getCate_name() {
		return cate_name;
	}

	public void setCate_name(String cate_name) {
		this.cate_name = cate_name;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getSupplyAmount() {
		return supplyAmount;
	}

	public void setSupplyAmount(int supplyAmount) {
		this.supplyAmount = supplyAmount;
	}

	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getSalesProfit() {
		return salesProfit;
	}

	public void setSalesProfit(int salesProfit) {
		this.salesProfit = salesProfit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p_name == null) ? 0 : p_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SWSale other = (SWSale) obj;
		if (p_name == null) {
			if (other.p_name != null)
				return false;
		} else if (!p_name.equals(other.p_name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SWSale [p_name=" + p_name + ", cate_name=" + cate_name + ", s_name=" + s_name + ", supplyAmount="
				+ supplyAmount + ", salesAmount=" + salesAmount + ", discount=" + discount + ", salesProfit="
				+ salesProfit + "]";
	}

}
