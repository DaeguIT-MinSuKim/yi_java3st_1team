package yi_java3st_1team.main.test;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import javafx.application.Platform;
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

public class JFrameLineChart {
	private static LineChart<String, Number> lineChart;

	public static void initAndShowGUI() {
		JFrame frame = new JFrame("Swing and JavaFX");
		frame.setBounds(1120, 650, 540,300);

		final JFXPanel fxPanel = new JFXPanel();

		frame.add(fxPanel, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

/*		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// JavaFX 데이터를 변경해야 할 때마다 코드를 Runnable 객체( Platform.runLater)로 래핑하고 메소드를 호출
				Platform.runLater(() -> {
					ObservableList<Data> answer = getChartData();
					answer.addAll(new PieChart.Data("java nio", 21),new PieChart.Data("java io", 20));
					
					pieChart.getData().clear();
					pieChart.setData(answer);
				});
			}
		});

		frame.add(btnAdd, BorderLayout.NORTH);*/

		Platform.runLater(() -> initFX(fxPanel));
	}

	private static void initFX(JFXPanel fxPanel) {
		Scene scene = createScene();
		fxPanel.setScene(scene);
	}

	private static Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root);
		root.setAutoSizeChildren(true);
		
		CategoryAxis xAxis = new CategoryAxis();
		xAxis.setLabel("과목");
		
				
		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("점수");

		lineChart = new LineChart<>(xAxis, yAxis);
		lineChart.setPrefSize(500, 250);
		lineChart.setData(getChartData());
		lineChart.setTitle("Line Chart");
		lineChart.setLegendVisible(true);	// 범례 표시 유무
		lineChart.setLegendSide(Side.BOTTOM);// 범례 위치

		root.getChildren().add(lineChart);

		return scene;
	}

	private static ObservableList<XYChart.Series<String, Number>> getChartData() {
		ObservableList<XYChart.Series<String, Number>> list = FXCollections.observableArrayList();
		Student std01 = new Student("S001", "현빈", 90, 80, 80);
		Student std02 = new Student("S002", "박신혜", 50, 60, 95);
				
		list.add(getChartData(std01));
		list.add(getChartData(std02));
		
		return list;
	}
	
	public static XYChart.Series<String, Number> getChartData(Student std) {
		XYChart.Series<String, Number> dataSeries = new Series<String, Number>();
		dataSeries.setName(std.getStdName());
		dataSeries.getData().add(new XYChart.Data<>("사전", std.getKorScore()));
		dataSeries.getData().add(new XYChart.Data<>("중간", std.getEngScore()));
		dataSeries.getData().add(new XYChart.Data<>("기말", std.getMathScore()));
		return dataSeries;
	}

}
