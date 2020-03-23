package yi_java3st_1team.main.employee.chart;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
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
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;
import yi_java3st_1team.viewsmanagement.dto.ClientChart;

@SuppressWarnings("serial")
public class PanelBarChart extends JFXPanel implements InitScene{
	private OrderUIService service;
	private BarChart<String, Number> barChart;
	private GregorianCalendar calendar;
	private int year;
	private int month;
	private List<MajorClient> cList;
	
	public PanelBarChart() {
	}

	@Override
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
		barChart.setTitle(year+"년 10대 주요 고객사 그래프");
		barChart.setPrefSize(350, 330);
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
		service = new OrderUIService();
		cList = service.selectMajorClientList();
		
		ObservableList<XYChart.Series<String, Number>> list = FXCollections.observableArrayList();
		ClientChart client = new ClientChart(cList.get(0).getcName().getcName(), cList.get(0).getTotalMoney());
		ClientChart client2 = new ClientChart(cList.get(1).getcName().getcName(), cList.get(1).getTotalMoney());
		ClientChart client3 = new ClientChart(cList.get(2).getcName().getcName(), cList.get(2).getTotalMoney());
		ClientChart client4 = new ClientChart(cList.get(3).getcName().getcName(), cList.get(3).getTotalMoney());
		ClientChart client5 = new ClientChart(cList.get(4).getcName().getcName(), cList.get(4).getTotalMoney());
		ClientChart client6 = new ClientChart(cList.get(5).getcName().getcName(), cList.get(5).getTotalMoney());
		ClientChart client7 = new ClientChart(cList.get(6).getcName().getcName(), cList.get(6).getTotalMoney());
		ClientChart client8 = new ClientChart(cList.get(7).getcName().getcName(), cList.get(7).getTotalMoney());
		ClientChart client9 = new ClientChart(cList.get(8).getcName().getcName(), cList.get(8).getTotalMoney());
		ClientChart client10 = new ClientChart(cList.get(9).getcName().getcName(), cList.get(9).getTotalMoney());
		
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
