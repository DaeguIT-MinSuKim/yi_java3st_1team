package yi_java3st_1team.viewsmanagement.ui.test;

import java.util.Iterator;

import yi_java3st_1team.viewsmanagement.ui.test.Student;
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

@SuppressWarnings("serial")
public class PanelBarChart extends JFXPanel implements InitScene{
	public PanelBarChart() {
	}

	private BarChart<String, Number> barChart;
	
	@Override
	public Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root, Color.ALICEBLUE);
		root.setAutoSizeChildren(true);
		
		//막 대형 차트의 X 축과 Y 축을 정의하고 레이블을 설정
		CategoryAxis xAxis = new CategoryAxis();
		xAxis.setLabel("과목");

		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("점수");

		barChart = new BarChart<>(xAxis, yAxis);
		barChart.setTitle("Bar Chart");
		
		barChart.setPrefSize(500, 500);
		barChart.setData(getChartData());
		
		root.getChildren().add(barChart);

		return scene;
	}
	
	
	/**
	 * @param std
	 * @return
	 */
	public XYChart.Series<String, Number> getChartData(Student std) {
		XYChart.Series<String, Number> dataSeries = new Series<String, Number>();
		dataSeries.setName(std.getStdName());
		dataSeries.getData().add(new XYChart.Data<>("국어", std.getKorScore()));
		dataSeries.getData().add(new XYChart.Data<>("영어", std.getEngScore()));
		dataSeries.getData().add(new XYChart.Data<>("수학", std.getMathScore()));
		return dataSeries;
	}
	
	private ObservableList<XYChart.Series<String, Number>> getChartData() {
		ObservableList<XYChart.Series<String, Number>> list = FXCollections.observableArrayList();
		Student std = new Student("S001", "현빈", 90, 60,70);
		Student std2 = new Student("S002", "박신혜", 60, 55,88);
		
		list.add(getChartData(std));
		list.add(getChartData(std2));
		
		return list;
	}

}
