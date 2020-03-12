package yi_java3st_1team.viewsmanagement.dto;

public class ClientSale {
	private String c_name;
	private String p_name;
	private int o_qty;
	private String o_dps;
	private int p_price;
	private int salesMoney;
	private int uncollected;

	public ClientSale() {
	}

	public ClientSale(String c_name, String p_name, int o_qty, String o_dps, int p_price, int salesMoney,
			int uncollected) {
		super();
		this.c_name = c_name;
		this.p_name = p_name;
		this.o_qty = o_qty;
		this.o_dps = o_dps;
		this.p_price = p_price;
		this.salesMoney = salesMoney;
		this.uncollected = uncollected;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getO_qty() {
		return o_qty;
	}

	public void setO_qty(int o_qty) {
		this.o_qty = o_qty;
	}

	public String getO_dps() {
		return o_dps;
	}

	public void setO_dps(String o_dps) {
		this.o_dps = o_dps;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public int getSalesMoney() {
		return salesMoney;
	}

	public void setSalesMoney(int salesMoney) {
		this.salesMoney = salesMoney;
	}

	public int getUncollected() {
		return uncollected;
	}

	public void setUncollected(int uncollected) {
		this.uncollected = uncollected;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c_name == null) ? 0 : c_name.hashCode());
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
		ClientSale other = (ClientSale) obj;
		if (c_name == null) {
			if (other.c_name != null)
				return false;
		} else if (!c_name.equals(other.c_name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClientSale [c_name=" + c_name + ", p_name=" + p_name + ", p_price=" + p_price + ", o_qty=" + o_qty
				+ ", o_dps=" + o_dps + ", salesMoney=" + salesMoney + ", uncollected=" + uncollected + "]";
	}

}
