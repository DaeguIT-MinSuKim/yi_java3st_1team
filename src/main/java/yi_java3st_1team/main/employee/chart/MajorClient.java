package yi_java3st_1team.main.employee.chart;

import yi_java3st_1team.clientmanagement.dto.Client;

public class MajorClient {
	private Client cName;
	private int totalMoney;

	public MajorClient() {
		// TODO Auto-generated constructor stub
	}

	public MajorClient(Client cName, int totalMoney) {
		this.cName = cName;
		this.totalMoney = totalMoney;
	}

	public Client getcName() {
		return cName;
	}

	public void setcName(Client cName) {
		this.cName = cName;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	@Override
	public String toString() {
		return String.format("MajorClient [cName=%s, totalMoney=%s]", cName, totalMoney);
	}

}
