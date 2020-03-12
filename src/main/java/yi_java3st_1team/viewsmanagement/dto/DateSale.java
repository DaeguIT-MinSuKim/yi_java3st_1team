package yi_java3st_1team.viewsmanagement.dto;

import java.sql.Date;

public class DateSale {
	private String o_no;
	private String c_name;
	private String p_name;
	private int o_qty;
	private String o_dps;
	private Date o_date;

	public DateSale() {
		// TODO Auto-generated constructor stub
	}

	public DateSale(String o_no, String c_name, String p_name, int o_qty, String o_dps, Date o_date) {
		super();
		this.o_no = o_no;
		this.c_name = c_name;
		this.p_name = p_name;
		this.o_qty = o_qty;
		this.o_dps = o_dps;
		this.o_date = o_date;
	}

	public String getO_no() {
		return o_no;
	}

	public void setO_no(String o_no) {
		this.o_no = o_no;
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

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((o_date == null) ? 0 : o_date.hashCode());
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
		DateSale other = (DateSale) obj;
		if (o_date == null) {
			if (other.o_date != null)
				return false;
		} else if (!o_date.equals(other.o_date))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DateSale [o_no=" + o_no + ", c_name=" + c_name + ", p_name=" + p_name + ", o_qty=" + o_qty + ", o_dps="
				+ o_dps + ", o_date=" + o_date + "]";
	}

}
