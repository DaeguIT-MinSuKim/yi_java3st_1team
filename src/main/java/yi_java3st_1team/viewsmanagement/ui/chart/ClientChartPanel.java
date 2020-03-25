package yi_java3st_1team.viewsmanagement.ui.chart;

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
import yi_java3st_1team.viewsmanagement.dto.ClientChart;
import yi_java3st_1team.viewsmanagement.ui.service.ClientChartUIService;

@SuppressWarnings("serial")
public class ClientChartPanel extends JFXPanel implements InitScene {
	private ClientChartUIService service;
	private BarChart<String, Number> barChart;
	private Calendar calendar;
	private int year;
	private int month;
	private int firstDay = 1;
	private int lastDay;

	
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
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, firstDay); 
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		barChart = new BarChart<>(xAxis, yAxis);
		barChart.setTitle(year+"년 "+month+"월 고객사 그래프");
		barChart.setPrefSize(640, 640);
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
		ObservableList<XYChart.Series<String, Number>> list = FXCollections.observableArrayList();
		
		service = new ClientChartUIService();

		String startDate = year+"-"+month+"-"+firstDay;
		String endDate = year+"-"+month+"-"+lastDay;
		java.util.List<ClientChart> clientChart = service.showClientChartList(startDate, endDate);
		
		ClientChart client = new ClientChart(clientChart.get(0).getC_name(), clientChart.get(0).getP_price());
		ClientChart client2 = new ClientChart(clientChart.get(1).getC_name(), clientChart.get(1).getP_price());
		ClientChart client3 = new ClientChart(clientChart.get(2).getC_name(), clientChart.get(2).getP_price());
		ClientChart client4 = new ClientChart(clientChart.get(3).getC_name(), clientChart.get(3).getP_price());
		ClientChart client5 = new ClientChart(clientChart.get(4).getC_name(), clientChart.get(4).getP_price());
		ClientChart client6 = new ClientChart(clientChart.get(5).getC_name(), clientChart.get(5).getP_price());
		ClientChart client7 = new ClientChart(clientChart.get(6).getC_name(), clientChart.get(6).getP_price());
		ClientChart client8 = new ClientChart(clientChart.get(7).getC_name(), clientChart.get(7).getP_price());
		ClientChart client9 = new ClientChart(clientChart.get(8).getC_name(), clientChart.get(8).getP_price());
		ClientChart client10 = new ClientChart(clientChart.get(9).getC_name(), clientChart.get(9).getP_price());
		
		list.add(getChartData(client));
		list.add(getChartData(client2));
		list.add(getChartData(client3));
		list.add(getChartData(client4));
		list.add(getChartData(client5));
		list.add(getChartData(client6));
		list.add(getChartData(client7));
		list.add(getChartData(client8));
		list.add(getChartData(client9));
		list.add(getChartData(client10));
		
		return list;
	}

}
