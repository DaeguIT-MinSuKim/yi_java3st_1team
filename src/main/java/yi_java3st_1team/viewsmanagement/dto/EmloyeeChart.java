package yi_java3st_1team.viewsmanagement.dto;

public class EmloyeeChart {
	private String e_name;
	private String o_count;

	public EmloyeeChart() {
	}

	public EmloyeeChart(String e_name, String o_count) {
		this.e_name = e_name;
		this.o_count = o_count;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getO_count() {
		return o_count;
	}

	public void setO_count(String o_count) {
		this.o_count = o_count;
	}

	@Override
	public String toString() {
		return String.format("EmloyeeChart [e_name=%s, o_count=%s]", e_name, o_count);
	}

}
