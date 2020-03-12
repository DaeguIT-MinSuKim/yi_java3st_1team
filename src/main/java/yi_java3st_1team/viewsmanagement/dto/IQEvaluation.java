package yi_java3st_1team.viewsmanagement.dto;

public class IQEvaluation {
	private String p_name;
	private String s_name;
	private int iq_qty;
	private int p_price;
	private int p_cost;
	private String evaluation;

	public IQEvaluation() {
		// TODO Auto-generated constructor stub
	}

	public IQEvaluation(String p_name, String s_name, int iq_qty, int p_price, int p_cost, String evaluation) {
		super();
		this.p_name = p_name;
		this.s_name = s_name;
		this.iq_qty = iq_qty;
		this.p_price = p_price;
		this.p_cost = p_cost;
		this.evaluation = evaluation;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getIq_qty() {
		return iq_qty;
	}

	public void setIq_qty(int iq_qty) {
		this.iq_qty = iq_qty;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public int getP_cost() {
		return p_cost;
	}

	public void setP_cost(int p_cost) {
		this.p_cost = p_cost;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
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
		IQEvaluation other = (IQEvaluation) obj;
		if (p_name == null) {
			if (other.p_name != null)
				return false;
		} else if (!p_name.equals(other.p_name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IQEvaluation [p_name=" + p_name + ", s_name=" + s_name + ", iq_qty=" + iq_qty + ", p_price=" + p_price
				+ ", p_cost=" + p_cost + ", evaluation=" + evaluation + "]";
	}

}
