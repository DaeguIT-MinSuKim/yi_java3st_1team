package yi_java3st_1team.main.ui.content.chart;

import java.util.Iterator;

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
import yi_java3st_1team.main.dto.Employee;

@SuppressWarnings("serial")
public class EmpMiniLineChart extends JFXPanel implements InitScene{
	public EmpMiniLineChart() {
	}

	private LineChart<String, Number> lineChart;
	private CategoryAxis xAxis;
	
	@Override
	public Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root);
		root.setAutoSizeChildren(true);
		
		//x축
		xAxis = new CategoryAxis();
		xAxis.setLabel("월별");
		
		//y축	
		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("실적");

		lineChart = new LineChart<>(xAxis, yAxis);
		lineChart.setPrefSize(500, 250);
		lineChart.setData(getChartData());
		lineChart.setTitle("영업관리부 팀별 실적");
		lineChart.setLegendVisible(true);	// 범례 표시 유무
		lineChart.setLegendSide(Side.BOTTOM);// 범례 위치

		root.getChildren().add(lineChart);

		return scene;
	}
	
	private ObservableList<XYChart.Series<String, Number>> getChartData() {
		ObservableList<XYChart.Series<String, Number>> list = FXCollections.observableArrayList();
//		Student std01 = new Student("S001", "현빈", 90, 80, 80);
//		Student std02 = new Student("S002", "박신혜", 50, 60, 95);
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
				
		list.add(getChartData(emp1));
		list.add(getChartData(emp2));
		
		return list;
	}
	
	public XYChart.Series<String, Number> getChartData(Employee item) {
		XYChart.Series<String, Number> dataSeries = new Series<String, Number>();
		dataSeries.setName(item.getEmpName());
		dataSeries.getData().add(new XYChart.Data<>("사전", item.getEmpNo()));
//		dataSeries.getData().add(new XYChart.Data<>("중간", item.getdNo()));
//		dataSeries.getData().add(new XYChart.Data<>("기말", item.getMathScore()));
		return dataSeries;
	}
	
	public void addChartData(Employee item) {
		lineChart.getData().add(getChartData(item));
	}

	public void addAllChartData() {
		lineChart.setData(getChartData());
	}
	
	public void deleteAllData() {
		lineChart.getData().clear();
	}
	
	public void delChartData(Employee item) {
		ObservableList<Series<String, Number>> list = lineChart.getData();
		Iterator<Series<String, Number>>  it = list.iterator();
		while(it.hasNext()) {
			Series<String, Number> s = it.next();
			if (s.getName().equals(item.getEmpName())) {
				lineChart.getData().remove(s);
				break;
			}
		}
	}
	
	public void updateChartData(Employee item) {
		ObservableList<Series<String, Number>> list = lineChart.getData();
		for(int i = 0; i<list.size(); i++) {
			Series<String, Number> s = list.get(i);
			if (s.getName().equals(item.getEmpName())) {
				s.getData().set(0, new XYChart.Data<>("사전", item.getEmpNo()));
//				s.getData().set(1, new XYChart.Data<>("중간", item.getEngScore()));
//				s.getData().set(2, new XYChart.Data<>("기말", item.getMathScore()));	
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
	}
}
