package yi_java3st_1team.viewsmanagement.dto;

public class Total {
	private int o_qty;
	private int p_price;
	private String total;

	public Total() {
	}

	public Total(String total) {
		super();
		this.total = total;
	}

	public Total(int o_qty, int p_price, String total) {
		super();
		this.o_qty = o_qty;
		this.p_price = p_price;
		this.total = total;
	}

	public int getO_qty() {
		return o_qty;
	}

	public void setO_qty(int o_qty) {
		this.o_qty = o_qty;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return total;
	}

	

}
