package yi_java3st_1team.viewsmanagement.ui.chart;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.paint.Color;
import yi_java3st_1team.main.employee.chart.DateOfMonth;
import yi_java3st_1team.main.employee.chart.Performance;
import yi_java3st_1team.viewsmanagement.dto.ClientChart;
import yi_java3st_1team.viewsmanagement.ui.service.ClientChartUIService;

@SuppressWarnings("serial")
public class ClientChartPanel extends JFXPanel implements InitScene {
	private ClientChartUIService service;
	private BarChart<String, Number> barChart;
	private GregorianCalendar calendar;
	private int year;
	private int month;
	
	public ClientChartPanel() {
	}
	
	public Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root, Color.ALICEBLUE);
		root.setAutoSizeChildren(true);
		
		CategoryAxis xAxis = new CategoryAxis();
//		xAxis.setLabel("고객사");
		
		NumberAxis yAxis = new NumberAxis();
//		yAxis.setLabel("판매금액");
		
		calendar = new GregorianCalendar(Locale.KOREA);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH) + 1;
		
		barChart = new BarChart<>(xAxis, yAxis);
		barChart.setData(getChartData());
		barChart.setTitle(year+"년 "+month+"월 고객사 그래프");
		
		barChart.setPrefSize(500, 500);
		barChart.setData(getChartData());
		
		root.getChildren().add(barChart);
		
		return scene;
	}
	
	public XYChart.Series<String, Number> getChartData(ClientChart co) {
		XYChart.Series<String, Number> dataSeries = new Series<String, Number>();
		dataSeries.setName(co.getC_name());
		dataSeries.getData().add(new XYChart.Data<>("고객사", co.getP_price()));
		return dataSeries;
	}

	private ObservableList<XYChart.Series<String, Number>> getChartData() {
		service = new ClientChartUIService();
		
		String sYear = year + "";
		String sMonth = month + "";
		List<ClientChart> dateList = getWeekInMonths(sYear, sMonth);
		int[][] total = new int[3][dateList.size()];
		int dept = 4;
		for(int i=0; i<3; i++) {
			for(int j=0; j<dateList.size(); j++) {
				String startDate = year + "-" + month + "-" + dateList.get(j).getStartDay();
				String endDate = year + "-" + month + "-" + dateList.get(j).getEndDay();
				total[i][j] = service.;
			}
			dept++;
		}
		System.out.println(total[0][4]);
		ObservableList<XYChart.Series<String, Number>> list = FXCollections.observableArrayList();
		Performance per01 = new Performance("S001", "영업 1팀", total[0][0], total[0][1], total[0][2], total[0][3], total[0][4]);
		Performance per02 = new Performance("S002", "영업 2팀", total[1][0], total[1][1], total[1][2], total[1][3], total[1][4]);
		Performance per03 = new Performance("S003", "영업 3팀", total[2][0], total[2][1], total[2][2], total[2][3], total[2][4]);
		
		list.add(getChartData(per01));
		list.add(getChartData(per02));
		list.add(getChartData(per03));
		
		return list;
		
//		ClientChart client = new ClientChart("세종특별자치시 교육청", 69360000);
//		ClientChart client2 = new ClientChart("제주특별자치도 교육청", 141120000);
//		ClientChart client3 = new ClientChart("윤복시스템", 288090000);
//		ClientChart client4 = new ClientChart("상내정보통신", 135794000);
//		ClientChart client5 = new ClientChart("대전광역시청", 438895000);
//		ClientChart client6 = new ClientChart("금변시스템", 1439658000);
//		ClientChart client7 = new ClientChart("대우시스템", 82560000);
//		ClientChart client8 = new ClientChart("전라북도 교육청", 1293600000);
//		ClientChart client9 = new ClientChart("대전광역시청", 438895000);
//		ClientChart client10 = new ClientChart("우고PC방", 61272000);
		
//		list.add(getChartData(client));
//		list.add(getChartData(client2));
//		list.add(getChartData(client3));
//		list.add(getChartData(client4));
//		list.add(getChartData(client5));
//		list.add(getChartData(client6));
//		list.add(getChartData(client7));
//		list.add(getChartData(client8));
//		list.add(getChartData(client9));
//		list.add(getChartData(client10));
		
		return list;
	}
	
	public XYChart.Series<String, Number> getChartData(Performance per) {
		XYChart.Series<String, Number> dataSeries = new Series<String, Number>();
		dataSeries.setName(per.getSaleName());
		dataSeries.getData().add(new XYChart.Data<>("1주차", per.getSales1()));
		dataSeries.getData().add(new XYChart.Data<>("2주차", per.getSales2()));
		dataSeries.getData().add(new XYChart.Data<>("3주차", per.getSales3()));
		dataSeries.getData().add(new XYChart.Data<>("4주차", per.getSales4()));
		dataSeries.getData().add(new XYChart.Data<>("5주차", per.getSales5()));
		return dataSeries;
	}
	
	public List<DateOfMonth> getWeekInMonths(String year, String month) {
		Calendar cal = Calendar.getInstance();
		int intYear = Integer.parseInt(year);
		int intMonth = Integer.parseInt(month);

		cal.set(Calendar.YEAR, intYear);
		cal.set(Calendar.MONTH, intMonth - 1);
		List<DateOfMonth> dateList = new ArrayList<DateOfMonth>();
		for (int week = 1; week < cal.getMaximum(Calendar.WEEK_OF_MONTH); week++) {
			cal.set(Calendar.WEEK_OF_MONTH, week);

			cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			int startDay = cal.get(Calendar.DAY_OF_MONTH);

			cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
			int endDay = cal.get(Calendar.DAY_OF_MONTH);

			if (week == 1 && startDay >= 7) {
				startDay = 1;
			}

			if (week == cal.getMaximum(Calendar.WEEK_OF_MONTH) - 1 && endDay <= 7) {
				endDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			}
			dateList.add(new DateOfMonth(startDay, endDay));
		}
		return dateList;
	}

}
