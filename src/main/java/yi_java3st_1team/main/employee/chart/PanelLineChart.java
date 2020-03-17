package yi_java3st_1team.main.employee.chart;

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

@SuppressWarnings("serial")
public class PanelLineChart extends JFXPanel implements InitScene{
	public PanelLineChart() {
	}

	private LineChart<String, Number> lineChart;
	private CategoryAxis xAxis;
	
	@Override
	public Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root);
		root.setAutoSizeChildren(true);
		
		// X축
		xAxis = new CategoryAxis();
		xAxis.setLabel("과목");
		
	    // Y축	
		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("점수");

		lineChart = new LineChart<>(xAxis, yAxis);
		lineChart.setPrefSize(1134, 348); //크기조절
		lineChart.setData(getChartData());
		lineChart.setTitle("2020년 3월 영업관리부 팀별 실적"); //차트제목
		lineChart.setLegendVisible(true);	// 범례 표시 유무
		lineChart.setLegendSide(Side.BOTTOM);// 범례 위치

		root.getChildren().add(lineChart);

		return scene;
	}
	
	private ObservableList<XYChart.Series<String, Number>> getChartData() {
		ObservableList<XYChart.Series<String, Number>> list = FXCollections.observableArrayList();
		Student std01 = new Student("S001", "영업 1팀", 90, 80, 80);
		Student std02 = new Student("S002", "영업 2팀", 50, 60, 95);
		Student std03 = new Student("S003", "영업 3팀", 90, 80, 80);
				
		list.add(getChartData(std01));
		list.add(getChartData(std02));
		list.add(getChartData(std03));
		
		return list;
	}
	
	public XYChart.Series<String, Number> getChartData(Student std) {
		XYChart.Series<String, Number> dataSeries = new Series<String, Number>();
		dataSeries.setName(std.getStdName());
		dataSeries.getData().add(new XYChart.Data<>("3월-첫째주", std.getKorScore()));
		dataSeries.getData().add(new XYChart.Data<>("3월-둘째주", std.getEngScore()));
		dataSeries.getData().add(new XYChart.Data<>("3월-셋째주", std.getMathScore()));
		dataSeries.getData().add(new XYChart.Data<>("3월-넷째주", std.getMathScore()));
		return dataSeries;
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
