package yi_java3st_1team.viewsmanagement.ui.chart;

import java.util.Calendar;
import java.util.List;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.paint.Color;
import yi_java3st_1team.viewsmanagement.dto.EmployeeChart;
import yi_java3st_1team.viewsmanagement.ui.service.EmployeeChartUIService;

@SuppressWarnings("serial")
public class NewEmployeeChartPanel extends JFXPanel implements InitScene {
	private PieChart pieChart;
	private EmployeeChartUIService service;
	private int firstDay = 1;
	private int lastDay;
	private List<EmployeeChart> rankingList;
	private double totalMoney;
	private int newMonth;
	private int newYear;

	public NewEmployeeChartPanel() {
	}

	public void setNewMonth(int newMonth) {
		this.newMonth = newMonth;
	}

	public void setNewYear(int newYear) {
		this.newYear = newYear;
	}

	public Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root, Color.ALICEBLUE);
		root.setAutoSizeChildren(true);

		int Year = newYear;
		int Month = newMonth;
		
		Calendar cal = Calendar.getInstance();
		cal.set(Year, Month, firstDay); 
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		pieChart = new PieChart();
		pieChart.setPrefSize(670, 600);
		pieChart.setData(getChartData());
		pieChart.setTitle("영업사원 실적현황 그래프");
		pieChart.setLegendVisible(true);	// 범례 표시 유무
		pieChart.setLegendSide(Side.BOTTOM);// 범례 위치
		pieChart.setLabelLineLength(30);	// 원의 둘레 가장자리와 라벨간의 거리 지정
		pieChart.setClockwise(true); 		// 시계방향 배치여부
		pieChart.setLabelsVisible(true);	// 레이블 표시여부
		
				
//		pieChart.getData().forEach(data -> data.nameProperty().bind(Bindings.concat(data.getName(), " ", data.pieValueProperty(), " %")));
		for(Data d : pieChart.getData()) {
			d.nameProperty().bind(Bindings.concat(d.getName(), " ", d.pieValueProperty(), " %"));
		}
		
		root.getChildren().add(pieChart);

		return scene;
	}
	
	private ObservableList<Data> getChartData() {
		ObservableList<Data> list = FXCollections.observableArrayList();
		
		service = new EmployeeChartUIService();
		
		String startDate = newYear+"-"+newMonth+"-"+firstDay;
		String endDate = newYear+"-"+newMonth+"-"+lastDay;
		rankingList = service.showEmployeeChart(startDate, endDate);
		double[] sales = new double[10];
		String[] name = new String[10];
		for(int i=0;i<rankingList.size();i++) {
			totalMoney += rankingList.get(i).getSalesMoney();
			sales[i] = rankingList.get(i).getSalesMoney();
			name[i] = rankingList.get(i).getE_name();
		}
		
		list.addAll(new PieChart.Data(name[0], Math.floor((sales[0]/totalMoney)*100)),
				new PieChart.Data(name[1], Math.floor((sales[1]/totalMoney)*100)),
				new PieChart.Data(name[2], Math.floor((sales[2]/totalMoney)*100)),
				new PieChart.Data(name[3], Math.floor((sales[3]/totalMoney)*100)),
				new PieChart.Data(name[4], Math.floor((sales[4]/totalMoney)*100)),
				new PieChart.Data(name[5], Math.floor((sales[5]/totalMoney)*100)),
				new PieChart.Data(name[6], Math.floor((sales[6]/totalMoney)*100)),
				new PieChart.Data(name[7], Math.floor((sales[7]/totalMoney)*100)),
				new PieChart.Data(name[8], Math.floor((sales[8]/totalMoney)*100)),
				new PieChart.Data(name[9], Math.floor((sales[9]/totalMoney)*100)));
		
		return list;
	}
}
