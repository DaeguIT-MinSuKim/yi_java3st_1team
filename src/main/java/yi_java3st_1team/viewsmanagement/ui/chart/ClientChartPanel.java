package yi_java3st_1team.viewsmanagement.ui.chart;

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
import yi_java3st_1team.viewsmanagement.dto.ClientOrder;

@SuppressWarnings("serial")
public class ClientChartPanel extends JFXPanel implements InitScene {
	public ClientChartPanel() {
	}
	
	private BarChart<String, Number> barChart;
	
	public Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root, Color.ALICEBLUE);
		root.setAutoSizeChildren(true);
		
		CategoryAxis xAxis = new CategoryAxis();
//		xAxis.setLabel("고객사");
		
		NumberAxis yAxis = new NumberAxis();
//		yAxis.setLabel("판매금액");
		
		barChart = new BarChart<>(xAxis, yAxis);
		barChart.setTitle("주요거래 10대 고객사");
		
		barChart.setPrefSize(500, 500);
		barChart.setData(getChartData());
		
		root.getChildren().add(barChart);
		
		return scene;
	}
	
	public XYChart.Series<String, Number> getChartData(ClientOrder co) {
		XYChart.Series<String, Number> dataSeries = new Series<String, Number>();
		dataSeries.setName(co.getC_name());
		dataSeries.getData().add(new XYChart.Data<>("고객사", co.getP_price()));
		return dataSeries;
	}

	private ObservableList<Series<String, Number>> getChartData() {
		ObservableList<XYChart.Series<String, Number>> list = FXCollections.observableArrayList();
		ClientOrder client = new ClientOrder("세종특별자치시 교육청", 69360000);
		ClientOrder client2 = new ClientOrder("제주특별자치도 교육청", 141120000);
		ClientOrder client3 = new ClientOrder("윤복시스템", 288090000);
		ClientOrder client4 = new ClientOrder("상내정보통신", 135794000);
		ClientOrder client5 = new ClientOrder("대전광역시청", 438895000);
		ClientOrder client6 = new ClientOrder("금변시스템", 1439658000);
		ClientOrder client7 = new ClientOrder("대우시스템", 82560000);
		ClientOrder client8 = new ClientOrder("전라북도 교육청", 1293600000);
		ClientOrder client9 = new ClientOrder("대전광역시청", 438895000);
		ClientOrder client10 = new ClientOrder("우고PC방", 61272000);
		
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
