package yi_java3st_1team.main.employee.chart;

public class DateOfMonth {
	private int startDay;
	private int endDay;

	public DateOfMonth() {
		// TODO Auto-generated constructor stub
	}

	public DateOfMonth(int startDay, int endDay) {
		this.startDay = startDay;
		this.endDay = endDay;
	}

	public int getStartDay() {
		return startDay;
	}

	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}

	public int getEndDay() {
		return endDay;
	}

	public void setEndDay(int endDay) {
		this.endDay = endDay;
	}

	@Override
	public String toString() {
		return String.format("DateOfMonth [startDay=%s, endDay=%s]", startDay, endDay);
	}

}
