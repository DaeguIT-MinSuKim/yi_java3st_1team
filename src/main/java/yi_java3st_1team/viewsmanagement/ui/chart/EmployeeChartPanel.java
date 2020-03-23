package yi_java3st_1team.viewsmanagement.ui.chart;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JTable;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

@SuppressWarnings("serial")
public class EmployeeChartPanel extends JFXPanel implements InitScene {
	private PieChart pieChart;

	public EmployeeChartPanel() {
	}

	public Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root);
		root.setAutoSizeChildren(true);
		
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
		list.addAll(new PieChart.Data("권수진", 24.6),
					new PieChart.Data("현무범", 9.1),
					new PieChart.Data("양사기", 9.1),
					new PieChart.Data("한지석", 9.1),
					new PieChart.Data("양옥고", 9.1),
					new PieChart.Data("문구심", 7.8),
					new PieChart.Data("최정력", 7.8),
					new PieChart.Data("양윤옥", 7.8),
					new PieChart.Data("최우사", 7.8),
					new PieChart.Data("한천심", 7.8));
		return list;
	}

}
