package yi_java3st_1team.main.test;

import java.util.Iterator;

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
		
		barChart.setPrefSize(500, 250);
		barChart.setData(getChartData());
		
		root.getChildren().add(barChart);

		return scene;
	}
	
	/**
	 * 전체 데이터 삭제
	 */
	public void deleteAllData() {
		barChart.getData().clear();
	}
	
	/** 해당 학생의 삭제
	 * @param std
	 */
	public void delChartData(Student std) {
		ObservableList<Series<String, Number>> list = barChart.getData();
		Iterator<Series<String, Number>>  it = list.iterator();
		while(it.hasNext()) {
			Series<String, Number> s = it.next();
			if (s.getName().equals(std.getStdName())) {
				barChart.getData().remove(s);
				break;
			}
		}
	}
	

	/**
	 * 해당 학생 정보 갱신
	 * @param std
	 */
	public void updateChartData(Student std) {
		ObservableList<Series<String, Number>> list = barChart.getData();
		
		for(int i = 0; i<list.size(); i++) {
			Series<String, Number> s = list.get(i);
			if (s.getName().equals(std.getStdName())) {
				s.getData().set(0, new XYChart.Data<>("국어", std.getKorScore()));
				s.getData().set(1, new XYChart.Data<>("영어", std.getEngScore()));
				s.getData().set(2, new XYChart.Data<>("수학", std.getMathScore()));	
				break;
			}
		}
	}
	
	/** getChartData() 를 이용하여 학생정보추가
	 * @param std
	 */
	public void addChartData(Student std) {
		barChart.getData().add(getChartData(std));
	}
	
	/**
	 * getChartData()에 의해 모든 데이터 추가
	 */
	public void addAllChartData() {
		barChart.setData(getChartData());
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
