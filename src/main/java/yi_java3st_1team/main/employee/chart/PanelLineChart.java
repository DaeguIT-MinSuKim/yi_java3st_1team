package yi_java3st_1team.main.employee.chart;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;

@SuppressWarnings("serial")
public class PanelLineChart extends JFXPanel implements InitScene{
	private LineChart<String, Number> lineChart;
	private CategoryAxis xAxis;
	private OrderUIService service;
	private Calendar calendar;
	private int year;
	private int month;
	
	public PanelLineChart() {
	}
	
	@Override
	public Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root);
		root.setAutoSizeChildren(true);
		
		// X축
		xAxis = new CategoryAxis();
//		xAxis.setLabel("분기");
		
	    // Y축	
		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("매출액");

		calendar = new GregorianCalendar(Locale.KOREA);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH) + 1;
		
		lineChart = new LineChart<>(xAxis, yAxis);
		lineChart.setPrefSize(1134, 348); //크기조절
		lineChart.setData(getChartData());
		lineChart.setTitle(year+"년 "+month+"월 영업관리부 팀별 실적"); //차트제목
		lineChart.setLegendVisible(true);	// 범례 표시 유무
		lineChart.setLegendSide(Side.BOTTOM);// 범례 위치

		root.getChildren().add(lineChart);

		return scene;
	}
	
	private ObservableList<XYChart.Series<String, Number>> getChartData() {
		service = new OrderUIService();
		//월별 각주차별 시작일 종료일 계산
		String sYear = year+"";
		String sMonth = month+"";
		List<DateOfMonth> dateList = getWeekInMonths(sYear, sMonth);
		int[][] total = new int[3][dateList.size()];
		int dept = 4;
		for(int i = 0; i<3; i++) {
			for (int j = 0; j < dateList.size(); j++) {
				String startDate = year + "-" + month + "-" + dateList.get(j).getStartDay();
				String endDate = year + "-" + month + "-" + dateList.get(j).getEndDay();
				total[i][j] = service.selectSalesMoney(startDate, endDate, dept); // 부서별, 주차 시작일, 종료일별 매출액 계산
			}
			dept++;
		}
		ObservableList<XYChart.Series<String, Number>> list = FXCollections.observableArrayList();
		Performance per01 = new Performance("S001", "영업 1팀", total[0][0], total[0][1], total[0][2], total[0][3], total[0][4]);
		Performance per02 = new Performance("S002", "영업 2팀", total[1][0], total[1][1], total[1][2], total[1][3], total[1][4]);
		Performance per03 = new Performance("S003", "영업 3팀", total[2][0], total[2][1], total[2][2], total[2][3], total[2][4]);
		
		list.add(getChartData(per01));
		list.add(getChartData(per02));
		list.add(getChartData(per03));
		
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
	
/*	버튼과 관련있는듯
	public void addChartData(Student std) {
		lineChart.getData().add(getChartData(std));
	}

	public void addAllChartData() {
		lineChart.setData(getChartData());
	}
	
	public void deleteAllData() {
		lineChart.getData().clear();
	}
	
	public void delChartData(Student std) {
		ObservableList<Series<String, Number>> list = lineChart.getData();
		Iterator<Series<String, Number>>  it = list.iterator();
		while(it.hasNext()) {
			Series<String, Number> s = it.next();
			if (s.getName().equals(std.getStdName())) {
				lineChart.getData().remove(s);
				break;
			}
		}
	}
	
	public void updateChartData(Student std) {
		ObservableList<Series<String, Number>> list = lineChart.getData();
		for(int i = 0; i<list.size(); i++) {
			Series<String, Number> s = list.get(i);
			if (s.getName().equals(std.getStdName())) {
				s.getData().set(0, new XYChart.Data<>("사전", std.getKorScore()));
				s.getData().set(1, new XYChart.Data<>("중간", std.getEngScore()));
				s.getData().set(2, new XYChart.Data<>("기말", std.getMathScore()));	
				break;
			}
		}
	}

	public void addSeries(String subj, int...score) {
		xAxis.setAutoRanging(false); 
		ObservableList<String> cList = xAxis.getCategories();
		cList.add(subj);
				
		ObservableList<Series<String, Number>> list = lineChart.getData();
		for(int i=0; i<list.size(); i++) {
			Series<String, Number> s = list.get(i);
			s.getData().add(new XYChart.Data<>(subj, score[i]));
		}
	}*/
}
