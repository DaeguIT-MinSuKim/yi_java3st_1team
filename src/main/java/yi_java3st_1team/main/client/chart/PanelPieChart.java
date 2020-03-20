package yi_java3st_1team.main.client.chart;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.main.client.ui.ClientMainUIPanel;
import yi_java3st_1team.main.employee.chart.InitScene;
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;

@SuppressWarnings("serial")
public class PanelPieChart extends JFXPanel implements InitScene{
	private PieChart pieChart;
	private Calendar calendar;
	private Client info;
	private int year;
	private int month;
	private int firstDay = 1;
	private int lastDay;
	private OrderUIService service;
	private List<OrderRanking> rankingList;
	private double totalMoney;
	
	public PanelPieChart() {
	}
	
	@Override
	public Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root);
		root.setAutoSizeChildren(true);
		
		calendar = new GregorianCalendar(Locale.KOREA);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH) + 1;
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, firstDay); 
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		service = new OrderUIService();
		info = ClientMainUIPanel.loginCl;
		
		pieChart = new PieChart();
		pieChart.setPrefSize(350, 250);
		pieChart.setData(getChartData());
		pieChart.setTitle(year+"년"+month+"월 주요 주문 상품");
		pieChart.setLegendVisible(true);	// 범례 표시 유무
		pieChart.setLegendSide(Side.BOTTOM);// 범례 위치
		pieChart.setLabelLineLength(50);	// 원의 둘레 가장자리와 라벨간의 거리 지정
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
		String firstDate = year+"-"+month+"-"+firstDay;
		String lastDate = year+"-"+month+"-"+lastDay;
		rankingList = service.selectOrderMoney(firstDate,lastDate,info);
		totalMoney = service.selectOrderTotalMoney(firstDate,lastDate,info);
		double[] money = new double[5];
		String[] name = new String[5];
		for(int i=0;i<rankingList.size();i++) {
			money[i] = rankingList.get(i).getOrMoney();
			name[i] = rankingList.get(i).getOrName();
		}
		ObservableList<Data> list = FXCollections.observableArrayList();
		list.addAll(new PieChart.Data(name[0], Math.floor((money[0]/totalMoney)*100)), 
				    new PieChart.Data(name[1], Math.floor((money[1]/totalMoney)*100)), 
				    new PieChart.Data(name[2], Math.floor((money[2]/totalMoney)*100)),
				    new PieChart.Data(name[3], Math.floor((money[3]/totalMoney)*100)),
				    new PieChart.Data(name[4], Math.floor((money[4]/totalMoney)*100)));
		return list;
	}

//	public void addChartData(String title, int count) {
//		Data d = new PieChart.Data(title, count);
//		pieChart.getData().add(d);
//		d.nameProperty().bind(Bindings.concat(d.getName(), " ", d.pieValueProperty(), " %"));
//	}
//	
//	public void delChartData(String title) {
//		ObservableList<Data> list =  pieChart.getData();
//		for(int i=0; i<list.size(); i++) {
//			Data d = list.get(i);
//			String[] strD = d.getName().split(" ");
//			if (strD[0].equals(title)) {
//				pieChart.getData().remove(i);
//				break;
//			}
//		}
//	}
//	
//	public void updateChartData(String title, int count) {
//		ObservableList<Data> list =  pieChart.getData();
//		
//		for(int i = 0; i<list.size(); i++) {
//			Data s = list.get(i);
//			String[] strD = s.getName().split(" ");
//			if (strD[0].equals(title)) {
//				s.setPieValue(count);
//				break;
//			}
//		}
//	}
//	
//	public void addAllChartData() {
//		pieChart.setData(getChartData());
//	}
//	
//	public void deleteAllData() {
//		pieChart.getData().clear();
//	}
}
